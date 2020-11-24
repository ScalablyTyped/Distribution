package typings.officeUiFabricReact.documentCardActivityTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.documentCardActivityBaseMod.DocumentCardActivityBase
import typings.react.mod.ClassAttributes
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentCardActivityProps extends ClassAttributes[DocumentCardActivityBase] {
  
  /**
    * Describes the activity that has taken place, such as "Created Feb 23, 2016".
    */
  var activity: String = js.native
  
  /**
    * Optional override class name
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Gets the component ref.
    */
  var componentRef: js.UndefOr[IRefObject[IDocumentCardActivity]] = js.native
  
  /**
    * One or more people who are involved in this activity.
    */
  var people: js.Array[IDocumentCardActivityPerson] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[
    IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles]
  ] = js.native
  
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
}
object IDocumentCardActivityProps {
  
  @scala.inline
  def apply(activity: String, people: js.Array[IDocumentCardActivityPerson]): IDocumentCardActivityProps = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActivityProps]
  }
  
  @scala.inline
  implicit class IDocumentCardActivityPropsOps[Self <: IDocumentCardActivityProps] (val x: Self) extends AnyVal {
    
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
    def setActivity(value: String): Self = this.set("activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeopleVarargs(value: IDocumentCardActivityPerson*): Self = this.set("people", js.Array(value :_*))
    
    @scala.inline
    def setPeople(value: js.Array[IDocumentCardActivityPerson]): Self = this.set("people", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponentRefFunction1(value: /* ref */ IDocumentCardActivity | Null => Unit): Self = this.set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setComponentRef(value: IRefObject[IDocumentCardActivity]): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IDocumentCardActivityStyleProps => DeepPartial[IDocumentCardActivityStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
