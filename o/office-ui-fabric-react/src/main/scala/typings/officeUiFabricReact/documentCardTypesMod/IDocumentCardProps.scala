package typings.officeUiFabricReact.documentCardTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.HTMLAttributes
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricUtilities.baseComponentTypesMod.IBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentCardProps
  extends HTMLAttributes[HTMLDivElement]
     with IBaseProps[IDocumentCard] {
  
  /**
    * Hex color value of the line below the card, which should correspond to the document type.
    * This should only be supplied when using the 'compact' card layout.
    *
    * Deprecated at v4.17.1, to be removed at \>= v5.0.0.
    * @deprecated To be removed at v5.0.0.
    */
  var accentColor: js.UndefOr[String] = js.native
  
  /**
    * A URL to navigate to when the card is clicked. If a function has also been provided,
    * it will be used instead of the URL.
    */
  var onClickHref: js.UndefOr[String] = js.native
  
  /**
    * A target browser context for opening the link. If not specified, will open in the same tab/window.
    */
  var onClickTarget: js.UndefOr[String] = js.native
  
  /**
    * Function to call when the card is clicked or keyboard Enter/Space is pushed.
    */
  @JSName("onClick")
  var onClick_IDocumentCardProps: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]] = js.native
  
  /**
    * Call to provide customized styling that will layer on top of the variant rules
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IDocumentCardStyleProps, IDocumentCardStyles]] = js.native
  
  /**
    * Theme provided by HOC.
    */
  var theme: js.UndefOr[ITheme] = js.native
  
  /**
    * The type of DocumentCard to display.
    * @defaultvalue DocumentCardType.normal
    */
  var `type`: js.UndefOr[DocumentCardType] = js.native
}
object IDocumentCardProps {
  
  @scala.inline
  def apply(): IDocumentCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentCardProps]
  }
  
  @scala.inline
  implicit class IDocumentCardPropsOps[Self <: IDocumentCardProps] (val x: Self) extends AnyVal {
    
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
    def setAccentColor(value: String): Self = this.set("accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccentColor: Self = this.set("accentColor", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnClickHref(value: String): Self = this.set("onClickHref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClickHref: Self = this.set("onClickHref", js.undefined)
    
    @scala.inline
    def setOnClickTarget(value: String): Self = this.set("onClickTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClickTarget: Self = this.set("onClickTarget", js.undefined)
    
    @scala.inline
    def setStylesFunction1(value: IDocumentCardStyleProps => DeepPartial[IDocumentCardStyles]): Self = this.set("styles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[IDocumentCardStyleProps, IDocumentCardStyles]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: DocumentCardType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
