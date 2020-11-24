package typings.nodeSass.mod.types

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait String extends Value {
  
  def getValue(): java.lang.String = js.native
  
  def setValue(s: java.lang.String): Unit = js.native
}
@JSImport("node-sass", "types.String")
@js.native
object String extends TopLevel[StringConstructor]
