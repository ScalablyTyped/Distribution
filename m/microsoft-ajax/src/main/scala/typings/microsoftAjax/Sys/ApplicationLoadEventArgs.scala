package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Event Args
/*
  * Used by the Application class to hold event arguments for the load event.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb383787(v=vs.100).aspx}
  */
@js.native
trait ApplicationLoadEventArgs extends js.Object {
  
  //#endregion
  //#region Properties
  /**
    * Gets an array of all the components that were created since the last time the load event was raised.
    * @return An array of all the components that were created since the last time the load event was raised.
    */
  def get_components(): js.Array[Component] = js.native
  
  /**
    * Returns a value that indicates whether the page is engaged in a partial-page update.
    * @return true if the page is engaged in a partial-page update; otherwise, false.
    */
  def get_isPartialLoad(): Boolean = js.native
}
object ApplicationLoadEventArgs {
  
  @scala.inline
  def apply(get_components: () => js.Array[Component], get_isPartialLoad: () => Boolean): ApplicationLoadEventArgs = {
    val __obj = js.Dynamic.literal(get_components = js.Any.fromFunction0(get_components), get_isPartialLoad = js.Any.fromFunction0(get_isPartialLoad))
    __obj.asInstanceOf[ApplicationLoadEventArgs]
  }
  
  @scala.inline
  implicit class ApplicationLoadEventArgsOps[Self <: ApplicationLoadEventArgs] (val x: Self) extends AnyVal {
    
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
    def setGet_components(value: () => js.Array[Component]): Self = this.set("get_components", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_isPartialLoad(value: () => Boolean): Self = this.set("get_isPartialLoad", js.Any.fromFunction0(value))
  }
}
