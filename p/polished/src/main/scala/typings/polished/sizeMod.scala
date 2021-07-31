package typings.polished

import typings.polished.styleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeMod {
  
  @JSImport("polished/lib/shorthands/size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(height: String): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(height.asInstanceOf[js.Any]).asInstanceOf[Styles]
  @scala.inline
  def default(height: String, width: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Styles]
  @scala.inline
  def default(height: String, width: Double): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Styles]
  @scala.inline
  def default(height: Double): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(height.asInstanceOf[js.Any]).asInstanceOf[Styles]
  @scala.inline
  def default(height: Double, width: String): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Styles]
  @scala.inline
  def default(height: Double, width: Double): Styles = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(height.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Styles]
}
