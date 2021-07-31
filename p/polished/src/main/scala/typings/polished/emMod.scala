package typings.polished

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emMod {
  
  @JSImport("polished/lib/helpers/em", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(value: String, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(value: String, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(value: Double, base: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def default(value: Double, base: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[String]
}
