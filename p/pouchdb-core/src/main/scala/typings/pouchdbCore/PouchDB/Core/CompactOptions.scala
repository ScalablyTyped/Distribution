package typings.pouchdbCore.PouchDB.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompactOptions extends Options {
  
  var interval: js.UndefOr[Double] = js.native
}
object CompactOptions {
  
  @scala.inline
  def apply(): CompactOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompactOptions]
  }
  
  @scala.inline
  implicit class CompactOptionsMutableBuilder[Self <: CompactOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
