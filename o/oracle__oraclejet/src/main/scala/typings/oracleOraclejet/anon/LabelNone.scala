package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelNone extends StObject {
  
  var labelNone: js.UndefOr[String] = js.native
}
object LabelNone {
  
  @scala.inline
  def apply(): LabelNone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelNone]
  }
  
  @scala.inline
  implicit class LabelNoneMutableBuilder[Self <: LabelNone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabelNone(value: String): Self = StObject.set(x, "labelNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNoneUndefined: Self = StObject.set(x, "labelNone", js.undefined)
  }
}
