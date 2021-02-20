package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INamedValues extends StObject {
  
  def Clone(): INamedValues = js.native
  
  def Contains(Name: String): Boolean = js.native
  
  var Modified: Boolean = js.native
  
  val Names: IStrings = js.native
  
  def Value(ValueName: String): js.Any = js.native
  def Value(ValueName: String, value: js.Any): Unit = js.native
}
