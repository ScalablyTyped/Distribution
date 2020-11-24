package typings.officeUiFabricReact.announcedTypesMod

import typings.officeUiFabricReact.announcedBaseMod.AnnouncedBase
import typings.officeUiFabricReact.officeUiFabricReactStrings.assertive
import typings.officeUiFabricReact.officeUiFabricReactStrings.off
import typings.officeUiFabricReact.officeUiFabricReactStrings.polite
import typings.react.mod.ElementType
import typings.react.mod.HTMLAttributes
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.std.HTMLDivElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.react.mod.Props because var conflicts: children. Inlined key, ref */ @js.native
trait IAnnouncedProps extends HTMLAttributes[HTMLDivElement] {
  
  /**
    * Priority with which the screen reader should treat updates to this region
    * @default 'polite'
    */
  @JSName("aria-live")
  var `aria-live_IAnnouncedProps`: js.UndefOr[off | polite | assertive] = js.native
  
  /**
    * Optionally render the root of this component as another component type or primitive.
    * The custom type **must** preserve any children or native props passed in.
    * @default 'div'
    */
  var as: js.UndefOr[ElementType[_]] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  /**
    * The status message provided as screen reader output
    */
  var message: js.UndefOr[String] = js.native
  
  var ref: js.UndefOr[LegacyRef[AnnouncedBase]] = js.native
  
  /** Call to provide customized styling that will layer on top of the variant rules. */
  var styles: js.UndefOr[IStyleFunctionOrObject[js.Object, IAnnouncedStyles]] = js.native
}
object IAnnouncedProps {
  
  @scala.inline
  def apply(): IAnnouncedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnnouncedProps]
  }
  
  @scala.inline
  implicit class IAnnouncedPropsOps[Self <: IAnnouncedProps] (val x: Self) extends AnyVal {
    
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
    def `setAria-live`(value: off | polite | assertive): Self = this.set("aria-live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteAria-live`: Self = this.set("aria-live", js.undefined)
    
    @scala.inline
    def setAs(value: ElementType[_]): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setRefFunction1(value: /* instance */ AnnouncedBase | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRef(value: LegacyRef[AnnouncedBase]): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
    
    @scala.inline
    def setStylesFunction1(value: js.Object => DeepPartial[IAnnouncedStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[js.Object, IAnnouncedStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
