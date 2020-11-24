package typings.nodeTlv.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOL extends Instantiable1[
      (/* dolData */ Buffer) | (/* dolData */ Double) | (/* dolData */ String), 
      DOLConstructed
    ] {
  
  def parse(dolData: String): DOLConstructed = js.native
}
