package typings.officeUiFabricReact.facepileTypesMod

import typings.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typings.officeUiFabricReact.personaTypesMod.PersonaInitialsColor
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFacepilePersona extends ButtonHTMLAttributes[HTMLButtonElement | HTMLDivElement] {
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
    */
  var allowPhoneInitials: js.UndefOr[Boolean] = js.native
  /**
    * Extra data - not used directly but can be handy for passing additional data to custom event
    * handlers.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The user's initials to display in the image area when there is no image.
    * @defaultvalue [Derived from personaName]
    */
  var imageInitials: js.UndefOr[String] = js.native
  /**
    * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The background color when the user's initials are displayed.
    * @defaultvalue [Derived from personaName]
    */
  var initialsColor: js.UndefOr[PersonaInitialsColor] = js.native
  /**
    * Optional keytip for this button that is only added when 'onClick' is defined for the persona
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * If provided, persona will be rendered with cursor:pointer and the handler will be
    * called on click.
    */
  @JSName("onClick")
  var onClick_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* persona */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.native
  /**
    * If provided, the handler will be called on mouse move.
    */
  @JSName("onMouseMove")
  var onMouseMove_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* persona */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.native
  /**
    * If provided, the handler will be called when mouse moves out of the component.
    */
  @JSName("onMouseOut")
  var onMouseOut_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], 
      /* persona */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.native
  /**
    * Name of the person.
    */
  var personaName: js.UndefOr[String] = js.native
}

object IFacepilePersona {
  @scala.inline
  def apply(): IFacepilePersona = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFacepilePersona]
  }
  @scala.inline
  implicit class IFacepilePersonaOps[Self <: IFacepilePersona] (val x: Self) extends AnyVal {
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
    def setAllowPhoneInitials(value: Boolean): Self = this.set("allowPhoneInitials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPhoneInitials: Self = this.set("allowPhoneInitials", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setImageInitials(value: String): Self = this.set("imageInitials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageInitials: Self = this.set("imageInitials", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setInitialsColor(value: PersonaInitialsColor): Self = this.set("initialsColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialsColor: Self = this.set("initialsColor", js.undefined)
    @scala.inline
    def setKeytipProps(value: IKeytipProps): Self = this.set("keytipProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeytipProps: Self = this.set("keytipProps", js.undefined)
    @scala.inline
    def setOnClick(
      value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
    ): Self = this.set("onClick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMouseMove(
      value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
    ): Self = this.set("onMouseMove", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseMove: Self = this.set("onMouseMove", js.undefined)
    @scala.inline
    def setOnMouseOut(
      value: (/* ev */ js.UndefOr[MouseEvent[HTMLElement, NativeMouseEvent]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
    ): Self = this.set("onMouseOut", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnMouseOut: Self = this.set("onMouseOut", js.undefined)
    @scala.inline
    def setPersonaName(value: String): Self = this.set("personaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersonaName: Self = this.set("personaName", js.undefined)
  }
  
}

