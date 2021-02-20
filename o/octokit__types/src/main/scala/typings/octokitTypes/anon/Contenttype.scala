package typings.octokitTypes.anon

import typings.octokitTypes.octokitTypesStrings.`textSlashplainSemicolon charsetEqualssignutf-8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Contenttype extends StObject {
  
  var `content-type`: `textSlashplainSemicolon charsetEqualssignutf-8` = js.native
}
object Contenttype {
  
  @scala.inline
  def apply(`content-type`: `textSlashplainSemicolon charsetEqualssignutf-8`): Contenttype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contenttype]
  }
  
  @scala.inline
  implicit class ContenttypeMutableBuilder[Self <: Contenttype] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setContent-type`(value: `textSlashplainSemicolon charsetEqualssignutf-8`): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
  }
}
