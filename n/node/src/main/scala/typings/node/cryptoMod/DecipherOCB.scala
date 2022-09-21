package typings.node.cryptoMod

import typings.node.anon.PlaintextLength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecipherOCB extends StObject {
  
  def setAAD(buffer: js.typedarray.ArrayBufferView): this.type = js.native
  def setAAD(buffer: js.typedarray.ArrayBufferView, options: PlaintextLength): this.type = js.native
  
  def setAuthTag(buffer: js.typedarray.ArrayBufferView): this.type = js.native
}
