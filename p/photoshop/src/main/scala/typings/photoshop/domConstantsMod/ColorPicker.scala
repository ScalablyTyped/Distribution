package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorPicker extends StObject
@JSImport("photoshop/dom/Constants", "ColorPicker")
@js.native
object ColorPicker extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ColorPicker & String] = js.native
  
  /**
    * The Adobe Color Picker.
    */
  @js.native
  sealed trait ADOBE
    extends StObject
       with ColorPicker
  /* "photoshopPicker" */ val ADOBE: typings.photoshop.domConstantsMod.ColorPicker.ADOBE & String = js.native
  
  /**
    * The built-in Apple or Windows color picker.
    */
  @js.native
  sealed trait OSNATIVE
    extends StObject
       with ColorPicker
  /* "systemPicker" */ val OSNATIVE: typings.photoshop.domConstantsMod.ColorPicker.OSNATIVE & String = js.native
  
  /**
    * The built-in Windows color picker.
    */
  @js.native
  sealed trait PLUGIN
    extends StObject
       with ColorPicker
  /* "pluginPicker" */ val PLUGIN: typings.photoshop.domConstantsMod.ColorPicker.PLUGIN & String = js.native
}
