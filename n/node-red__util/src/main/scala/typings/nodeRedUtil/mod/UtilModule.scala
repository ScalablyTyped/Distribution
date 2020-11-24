package typings.nodeRedUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilModule extends js.Object {
  
  /**
    * Internationalization utilities
    */
  var i18n: I18n = js.native
  
  /**
    * Initialise the module with the runtime settings
    * @param settings
    */
  def init(
    settings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify runtime.LocalSettings */ js.Any
  ): Unit = js.native
  
  /**
    * Logging utilities
    */
  var log: Log = js.native
  
  /**
    * General utilities
    */
  var util: Util = js.native
}
object UtilModule {
  
  @scala.inline
  def apply(
    i18n: I18n,
    init: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify runtime.LocalSettings */ js.Any => Unit,
    log: Log,
    util: Util
  ): UtilModule = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], init = js.Any.fromFunction1(init), log = log.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[UtilModule]
  }
  
  @scala.inline
  implicit class UtilModuleOps[Self <: UtilModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setI18n(value: I18n): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInit(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify runtime.LocalSettings */ js.Any => Unit
    ): Self = this.set("init", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLog(value: Log): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtil(value: Util): Self = this.set("util", value.asInstanceOf[js.Any])
  }
}
