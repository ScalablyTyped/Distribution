package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripUnitMod {
  
  @JSImport("polished/lib/helpers/stripUnit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(value: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def default(value: String, unitReturn: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], unitReturn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def default(value: Double): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def default(value: Double, unitReturn: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], unitReturn.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
