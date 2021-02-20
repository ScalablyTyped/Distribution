package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColor extends StObject {
  
  /**
    * The alpha component in the range [0-1].
    */
  val alpha: Double = js.native
  
  /**
    * The blue component in the range [0-1].
    */
  val blue: Double = js.native
  
  /**
    * The green component in the range [0-1].
    */
  val green: Double = js.native
  
  /**
    * The red component in the range [0-1].
    */
  val red: Double = js.native
}
object IColor {
  
  @scala.inline
  def apply(alpha: Double, blue: Double, green: Double, red: Double): IColor = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColor]
  }
  
  @scala.inline
  implicit class IColorMutableBuilder[Self <: IColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlue(value: Double): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: Double): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: Double): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
  }
}
