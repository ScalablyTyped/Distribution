package typings.microsoftAjax.Sys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used by the propertyChanged event to indicate which property has changed.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb310957(v=vs.100).aspx}
  */
@js.native
trait PropertyChangedEventArgs extends EventArgs {
  
  //#endregion
  //#region Methods
  /**
    * Gets the name of the property that changed.
    * Use the propertyName property to determine the name of the property that changed.
    * @return A string that contains the name of the property that changed.
    */
  def propertyName(): String = js.native
}
object PropertyChangedEventArgs {
  
  @scala.inline
  def apply(Empty: EventArgs, propertyName: () => String): PropertyChangedEventArgs = {
    val __obj = js.Dynamic.literal(Empty = Empty.asInstanceOf[js.Any], propertyName = js.Any.fromFunction0(propertyName))
    __obj.asInstanceOf[PropertyChangedEventArgs]
  }
  
  @scala.inline
  implicit class PropertyChangedEventArgsOps[Self <: PropertyChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setPropertyName(value: () => String): Self = this.set("propertyName", js.Any.fromFunction0(value))
  }
}
