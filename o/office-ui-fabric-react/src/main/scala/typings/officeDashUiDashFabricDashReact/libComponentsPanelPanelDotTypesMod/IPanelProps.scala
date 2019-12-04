package typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libCreateRefMod.IRefObject
import typings.atUifabricUtilities.libIRenderFunctionMod.IRenderFunction
import typings.officeDashUiDashFabricDashReact.libComponentsFocusTrapZoneFocusTrapZoneDotTypesMod.IFocusTrapZoneProps
import typings.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotTypesMod.ILayerProps
import typings.officeDashUiDashFabricDashReact.libComponentsOverlayOverlayDotTypesMod.IOverlayProps
import typings.officeDashUiDashFabricDashReact.libComponentsPanelPanelDotBaseMod.PanelBase
import typings.react.Anon_Html
import typings.react.reactMod.AnimationEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ClipboardEvent
import typings.react.reactMod.CompositionEvent
import typings.react.reactMod.DragEvent
import typings.react.reactMod.FocusEvent
import typings.react.reactMod.FormEvent
import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.PointerEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.TransitionEvent
import typings.react.reactMod.UIEvent
import typings.react.reactMod.WheelEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.react.reactStrings.`additions text`
import typings.react.reactStrings.`inline`
import typings.react.reactStrings.additions
import typings.react.reactStrings.all
import typings.react.reactStrings.ascending
import typings.react.reactStrings.assertive
import typings.react.reactStrings.both
import typings.react.reactStrings.copy
import typings.react.reactStrings.date
import typings.react.reactStrings.decimal
import typings.react.reactStrings.descending
import typings.react.reactStrings.dialog
import typings.react.reactStrings.email
import typings.react.reactStrings.execute
import typings.react.reactStrings.grammar
import typings.react.reactStrings.grid
import typings.react.reactStrings.horizontal
import typings.react.reactStrings.link
import typings.react.reactStrings.list
import typings.react.reactStrings.listbox
import typings.react.reactStrings.location
import typings.react.reactStrings.menu
import typings.react.reactStrings.mixed
import typings.react.reactStrings.move
import typings.react.reactStrings.no
import typings.react.reactStrings.none
import typings.react.reactStrings.numeric
import typings.react.reactStrings.off
import typings.react.reactStrings.on
import typings.react.reactStrings.other
import typings.react.reactStrings.page
import typings.react.reactStrings.polite
import typings.react.reactStrings.popup
import typings.react.reactStrings.removals
import typings.react.reactStrings.search
import typings.react.reactStrings.spelling
import typings.react.reactStrings.step
import typings.react.reactStrings.tel
import typings.react.reactStrings.text
import typings.react.reactStrings.time
import typings.react.reactStrings.tree
import typings.react.reactStrings.url
import typings.react.reactStrings.vertical
import typings.react.reactStrings.yes
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelProps extends HTMLAttributes[PanelBase] {
  /**
    * Aria label on close button
    */
  var closeButtonAriaLabel: js.UndefOr[String] = js.undefined
  /**
    * Deprecated property. Serves no function.
    * @deprecated Serves no function.
    */
  var componentId: js.UndefOr[String] = js.undefined
  /**
    * Optional callback to access the IPanel interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPanel]] = js.undefined
  /**
    * Custom panel width, used only when `type` is set to `PanelType.custom`.
    */
  var customWidth: js.UndefOr[String] = js.undefined
  /**
    * Sets the HTMLElement to focus on when exiting the FocusTrapZone.
    * @defaultvalue The element.target that triggered the Panel.
    */
  var elementToFocusOnDismiss: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Indicates the selector for first focusable item.
    * Deprecated, use `focusTrapZoneProps`.
    * @deprecated Use `focusTrapZoneProps`.
    */
  var firstFocusableSelector: js.UndefOr[String] = js.undefined
  /**
    * Optional props to pass to the FocusTrapZone component to manage focus in the panel.
    */
  var focusTrapZoneProps: js.UndefOr[IFocusTrapZoneProps] = js.undefined
  /**
    * Indicates whether Panel should force focus inside the focus trap zone.
    * If not explicitly specified, behavior aligns with FocusTrapZone's default behavior.
    * Deprecated, use `focusTrapZoneProps`.
    * @deprecated Use `focusTrapZoneProps`.
    */
  var forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined
  /**
    * Has the close button visible.
    * @defaultvalue true
    */
  var hasCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional parameter to provider the class name for header text
    */
  var headerClassName: js.UndefOr[String] = js.undefined
  /**
    * Header text for the Panel.
    * @defaultvalue ""
    */
  var headerText: js.UndefOr[String] = js.undefined
  /**
    * Indicates if this Panel will ignore keeping track of HTMLElement that activated the Zone.
    * Deprecated, use `focusTrapZoneProps`.
    * @defaultvalue false
    * @deprecated Use `focusTrapZoneProps`.
    */
  var ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the panel uses a modal overlay or not
    * @defaultvalue true
    */
  var isBlocking: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines if content should stretch to fill available space putting footer at the bottom of the page
    * @defaultvalue false
    */
  var isFooterAtBottom: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the panel is hidden on dismiss, instead of destroyed in the DOM.
    * Protects the contents from being destroyed when the panel is dismissed.
    * @defaultvalue false
    */
  var isHiddenOnDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the panel can be light dismissed.
    * @defaultvalue false
    */
  var isLightDismiss: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the panel is displayed.
    * If true, will cause panel to stay open even if dismissed.
    * If false, will cause panel to stay hidden.
    * If undefined, will allow the panel to control its own visility through open/dismiss methods.
    * @defaultvalue undefined
    */
  var isOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional props to pass to the Layer component hosting the panel.
    */
  var layerProps: js.UndefOr[ILayerProps] = js.undefined
  /**
    * A callback function for when the panel is closed, before the animation completes.
    * If the panel should NOT be dismissed based on some keyboard event, then simply call ev.preventDefault() on it
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]] = js.undefined
  /**
    * A callback function which is called **after** the Panel is dismissed and the animation is complete.
    * (If you need to update the Panel's `isOpen` prop in response to a dismiss event, use `onDismiss` instead.)
    */
  var onDismissed: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional custom function to handle clicks outside the panel in lightdismiss mode
    */
  var onLightDismissClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A callback function for when the Panel is opened, before the animation completes.
    */
  var onOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * A callback function for when the Panel is opened, after the animation completes.
    */
  var onOpened: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional custom function to handle clicks outside this component
    */
  var onOuterClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional custom renderer for body region. Replaces any children passed into the component.
    */
  var onRenderBody: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  /**
    * Optional custom renderer for footer region. Replaces sticky footer.
    */
  var onRenderFooter: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  /**
    * Custom renderer for content in the sticky footer
    */
  var onRenderFooterContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  /**
    * Optional custom renderer for header region. Replaces current title
    */
  var onRenderHeader: js.UndefOr[IPanelHeaderRenderer] = js.undefined
  /**
    * Optional custom renderer navigation region. Replaces the region that contains the close button.
    */
  var onRenderNavigation: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  /**
    * Optional custom renderer for content in the navigation region. Replaces current close button.
    */
  var onRenderNavigationContent: js.UndefOr[IRenderFunction[IPanelProps]] = js.undefined
  /**
    * Optional props to pass to the Overlay component that the panel uses.
    */
  var overlayProps: js.UndefOr[IOverlayProps] = js.undefined
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles]] = js.undefined
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.undefined
  /**
    * Type of the panel.
    * @defaultvalue PanelType.smallFixedFar
    */
  var `type`: js.UndefOr[PanelType] = js.undefined
}

object IPanelProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    `aria-activedescendant`: String = null,
    `aria-atomic`: js.UndefOr[Boolean] = js.undefined,
    `aria-autocomplete`: none | `inline` | list | both = null,
    `aria-busy`: js.UndefOr[Boolean] = js.undefined,
    `aria-checked`: Boolean | mixed = null,
    `aria-colcount`: Int | Double = null,
    `aria-colindex`: Int | Double = null,
    `aria-colspan`: Int | Double = null,
    `aria-controls`: String = null,
    `aria-current`: Boolean | page | step | location | date | time = null,
    `aria-describedby`: String = null,
    `aria-details`: String = null,
    `aria-disabled`: js.UndefOr[Boolean] = js.undefined,
    `aria-dropeffect`: none | copy | execute | link | move | popup = null,
    `aria-errormessage`: String = null,
    `aria-expanded`: js.UndefOr[Boolean] = js.undefined,
    `aria-flowto`: String = null,
    `aria-grabbed`: js.UndefOr[Boolean] = js.undefined,
    `aria-haspopup`: Boolean | menu | listbox | tree | grid | dialog = null,
    `aria-hidden`: js.UndefOr[Boolean] = js.undefined,
    `aria-invalid`: Boolean | grammar | spelling = null,
    `aria-keyshortcuts`: String = null,
    `aria-label`: String = null,
    `aria-labelledby`: String = null,
    `aria-level`: Int | Double = null,
    `aria-live`: off | assertive | polite = null,
    `aria-modal`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiline`: js.UndefOr[Boolean] = js.undefined,
    `aria-multiselectable`: js.UndefOr[Boolean] = js.undefined,
    `aria-orientation`: horizontal | vertical = null,
    `aria-owns`: String = null,
    `aria-placeholder`: String = null,
    `aria-posinset`: Int | Double = null,
    `aria-pressed`: Boolean | mixed = null,
    `aria-readonly`: js.UndefOr[Boolean] = js.undefined,
    `aria-relevant`: additions | (`additions text`) | all | removals | text = null,
    `aria-required`: js.UndefOr[Boolean] = js.undefined,
    `aria-roledescription`: String = null,
    `aria-rowcount`: Int | Double = null,
    `aria-rowindex`: Int | Double = null,
    `aria-rowspan`: Int | Double = null,
    `aria-selected`: js.UndefOr[Boolean] = js.undefined,
    `aria-setsize`: Int | Double = null,
    `aria-sort`: none | ascending | descending | other = null,
    `aria-valuemax`: Int | Double = null,
    `aria-valuemin`: Int | Double = null,
    `aria-valuenow`: Int | Double = null,
    `aria-valuetext`: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    children: ReactNode = null,
    className: String = null,
    closeButtonAriaLabel: String = null,
    color: String = null,
    componentId: String = null,
    componentRef: IRefObject[IPanel] = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    customWidth: String = null,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    elementToFocusOnDismiss: HTMLElement = null,
    firstFocusableSelector: String = null,
    focusTrapZoneProps: IFocusTrapZoneProps = null,
    forceFocusInsideTrap: js.UndefOr[Boolean] = js.undefined,
    hasCloseButton: js.UndefOr[Boolean] = js.undefined,
    headerClassName: String = null,
    headerText: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignoreExternalFocusing: js.UndefOr[Boolean] = js.undefined,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    isBlocking: js.UndefOr[Boolean] = js.undefined,
    isFooterAtBottom: js.UndefOr[Boolean] = js.undefined,
    isHiddenOnDismiss: js.UndefOr[Boolean] = js.undefined,
    isLightDismiss: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    layerProps: ILayerProps = null,
    onAbort: SyntheticEvent[PanelBase, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[PanelBase] => Unit = null,
    onAnimationIteration: AnimationEvent[PanelBase] => Unit = null,
    onAnimationStart: AnimationEvent[PanelBase] => Unit = null,
    onAuxClick: MouseEvent[PanelBase, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[PanelBase] => Unit = null,
    onBlur: FocusEvent[PanelBase] => Unit = null,
    onCanPlay: SyntheticEvent[PanelBase, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[PanelBase, Event] => Unit = null,
    onChange: FormEvent[PanelBase] => Unit = null,
    onClick: MouseEvent[PanelBase, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[PanelBase] => Unit = null,
    onCompositionStart: CompositionEvent[PanelBase] => Unit = null,
    onCompositionUpdate: CompositionEvent[PanelBase] => Unit = null,
    onContextMenu: MouseEvent[PanelBase, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[PanelBase] => Unit = null,
    onCut: ClipboardEvent[PanelBase] => Unit = null,
    onDismiss: /* ev */ js.UndefOr[SyntheticEvent[HTMLElement, Event]] => Unit = null,
    onDismissed: () => Unit = null,
    onDoubleClick: MouseEvent[PanelBase, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[PanelBase] => Unit = null,
    onDragEnd: DragEvent[PanelBase] => Unit = null,
    onDragEnter: DragEvent[PanelBase] => Unit = null,
    onDragExit: DragEvent[PanelBase] => Unit = null,
    onDragLeave: DragEvent[PanelBase] => Unit = null,
    onDragOver: DragEvent[PanelBase] => Unit = null,
    onDragStart: DragEvent[PanelBase] => Unit = null,
    onDrop: DragEvent[PanelBase] => Unit = null,
    onDurationChange: SyntheticEvent[PanelBase, Event] => Unit = null,
    onEmptied: SyntheticEvent[PanelBase, Event] => Unit = null,
    onEncrypted: SyntheticEvent[PanelBase, Event] => Unit = null,
    onEnded: SyntheticEvent[PanelBase, Event] => Unit = null,
    onError: SyntheticEvent[PanelBase, Event] => Unit = null,
    onFocus: FocusEvent[PanelBase] => Unit = null,
    onInput: FormEvent[PanelBase] => Unit = null,
    onInvalid: FormEvent[PanelBase] => Unit = null,
    onKeyDown: KeyboardEvent[PanelBase] => Unit = null,
    onKeyPress: KeyboardEvent[PanelBase] => Unit = null,
    onKeyUp: KeyboardEvent[PanelBase] => Unit = null,
    onLightDismissClick: () => Unit = null,
    onLoad: SyntheticEvent[PanelBase, Event] => Unit = null,
    onLoadStart: SyntheticEvent[PanelBase, Event] => Unit = null,
    onLoadedData: SyntheticEvent[PanelBase, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[PanelBase, Event] => Unit = null,
    onMouseDown: MouseEvent[PanelBase, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[PanelBase, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[PanelBase, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[PanelBase, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[PanelBase, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[PanelBase, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[PanelBase, NativeMouseEvent] => Unit = null,
    onOpen: () => Unit = null,
    onOpened: () => Unit = null,
    onOuterClick: () => Unit = null,
    onPaste: ClipboardEvent[PanelBase] => Unit = null,
    onPause: SyntheticEvent[PanelBase, Event] => Unit = null,
    onPlay: SyntheticEvent[PanelBase, Event] => Unit = null,
    onPlaying: SyntheticEvent[PanelBase, Event] => Unit = null,
    onPointerCancel: PointerEvent[PanelBase] => Unit = null,
    onPointerDown: PointerEvent[PanelBase] => Unit = null,
    onPointerEnter: PointerEvent[PanelBase] => Unit = null,
    onPointerLeave: PointerEvent[PanelBase] => Unit = null,
    onPointerMove: PointerEvent[PanelBase] => Unit = null,
    onPointerOut: PointerEvent[PanelBase] => Unit = null,
    onPointerOver: PointerEvent[PanelBase] => Unit = null,
    onPointerUp: PointerEvent[PanelBase] => Unit = null,
    onProgress: SyntheticEvent[PanelBase, Event] => Unit = null,
    onRateChange: SyntheticEvent[PanelBase, Event] => Unit = null,
    onRenderBody: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null = null,
    onRenderFooter: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null = null,
    onRenderFooterContent: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null = null,
    onRenderHeader: IPanelHeaderRenderer = null,
    onRenderNavigation: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null = null,
    onRenderNavigationContent: (/* props */ js.UndefOr[IPanelProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPanelProps], Element | Null]]) => Element | Null = null,
    onReset: FormEvent[PanelBase] => Unit = null,
    onScroll: UIEvent[PanelBase] => Unit = null,
    onSeeked: SyntheticEvent[PanelBase, Event] => Unit = null,
    onSeeking: SyntheticEvent[PanelBase, Event] => Unit = null,
    onSelect: SyntheticEvent[PanelBase, Event] => Unit = null,
    onStalled: SyntheticEvent[PanelBase, Event] => Unit = null,
    onSubmit: FormEvent[PanelBase] => Unit = null,
    onSuspend: SyntheticEvent[PanelBase, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[PanelBase, Event] => Unit = null,
    onTouchCancel: TouchEvent[PanelBase] => Unit = null,
    onTouchEnd: TouchEvent[PanelBase] => Unit = null,
    onTouchMove: TouchEvent[PanelBase] => Unit = null,
    onTouchStart: TouchEvent[PanelBase] => Unit = null,
    onTransitionEnd: TransitionEvent[PanelBase] => Unit = null,
    onVolumeChange: SyntheticEvent[PanelBase, Event] => Unit = null,
    onWaiting: SyntheticEvent[PanelBase, Event] => Unit = null,
    onWheel: WheelEvent[PanelBase] => Unit = null,
    overlayProps: IOverlayProps = null,
    placeholder: String = null,
    prefix: String = null,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    styles: IStyleFunctionOrObject[IPanelStyleProps, IPanelStyles] = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    theme: ITheme = null,
    title: String = null,
    translate: yes | no = null,
    `type`: PanelType = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): IPanelProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (`aria-activedescendant` != null) __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-atomic`)) __obj.updateDynamic("aria-atomic")(`aria-atomic`.asInstanceOf[js.Any])
    if (`aria-autocomplete` != null) __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-busy`)) __obj.updateDynamic("aria-busy")(`aria-busy`.asInstanceOf[js.Any])
    if (`aria-checked` != null) __obj.updateDynamic("aria-checked")(`aria-checked`.asInstanceOf[js.Any])
    if (`aria-colcount` != null) __obj.updateDynamic("aria-colcount")(`aria-colcount`.asInstanceOf[js.Any])
    if (`aria-colindex` != null) __obj.updateDynamic("aria-colindex")(`aria-colindex`.asInstanceOf[js.Any])
    if (`aria-colspan` != null) __obj.updateDynamic("aria-colspan")(`aria-colspan`.asInstanceOf[js.Any])
    if (`aria-controls` != null) __obj.updateDynamic("aria-controls")(`aria-controls`.asInstanceOf[js.Any])
    if (`aria-current` != null) __obj.updateDynamic("aria-current")(`aria-current`.asInstanceOf[js.Any])
    if (`aria-describedby` != null) __obj.updateDynamic("aria-describedby")(`aria-describedby`.asInstanceOf[js.Any])
    if (`aria-details` != null) __obj.updateDynamic("aria-details")(`aria-details`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-disabled`)) __obj.updateDynamic("aria-disabled")(`aria-disabled`.asInstanceOf[js.Any])
    if (`aria-dropeffect` != null) __obj.updateDynamic("aria-dropeffect")(`aria-dropeffect`.asInstanceOf[js.Any])
    if (`aria-errormessage` != null) __obj.updateDynamic("aria-errormessage")(`aria-errormessage`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-expanded`)) __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    if (`aria-flowto` != null) __obj.updateDynamic("aria-flowto")(`aria-flowto`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-grabbed`)) __obj.updateDynamic("aria-grabbed")(`aria-grabbed`.asInstanceOf[js.Any])
    if (`aria-haspopup` != null) __obj.updateDynamic("aria-haspopup")(`aria-haspopup`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-hidden`)) __obj.updateDynamic("aria-hidden")(`aria-hidden`.asInstanceOf[js.Any])
    if (`aria-invalid` != null) __obj.updateDynamic("aria-invalid")(`aria-invalid`.asInstanceOf[js.Any])
    if (`aria-keyshortcuts` != null) __obj.updateDynamic("aria-keyshortcuts")(`aria-keyshortcuts`.asInstanceOf[js.Any])
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (`aria-labelledby` != null) __obj.updateDynamic("aria-labelledby")(`aria-labelledby`.asInstanceOf[js.Any])
    if (`aria-level` != null) __obj.updateDynamic("aria-level")(`aria-level`.asInstanceOf[js.Any])
    if (`aria-live` != null) __obj.updateDynamic("aria-live")(`aria-live`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-modal`)) __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiline`)) __obj.updateDynamic("aria-multiline")(`aria-multiline`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-multiselectable`)) __obj.updateDynamic("aria-multiselectable")(`aria-multiselectable`.asInstanceOf[js.Any])
    if (`aria-orientation` != null) __obj.updateDynamic("aria-orientation")(`aria-orientation`.asInstanceOf[js.Any])
    if (`aria-owns` != null) __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    if (`aria-placeholder` != null) __obj.updateDynamic("aria-placeholder")(`aria-placeholder`.asInstanceOf[js.Any])
    if (`aria-posinset` != null) __obj.updateDynamic("aria-posinset")(`aria-posinset`.asInstanceOf[js.Any])
    if (`aria-pressed` != null) __obj.updateDynamic("aria-pressed")(`aria-pressed`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-readonly`)) __obj.updateDynamic("aria-readonly")(`aria-readonly`.asInstanceOf[js.Any])
    if (`aria-relevant` != null) __obj.updateDynamic("aria-relevant")(`aria-relevant`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-required`)) __obj.updateDynamic("aria-required")(`aria-required`.asInstanceOf[js.Any])
    if (`aria-roledescription` != null) __obj.updateDynamic("aria-roledescription")(`aria-roledescription`.asInstanceOf[js.Any])
    if (`aria-rowcount` != null) __obj.updateDynamic("aria-rowcount")(`aria-rowcount`.asInstanceOf[js.Any])
    if (`aria-rowindex` != null) __obj.updateDynamic("aria-rowindex")(`aria-rowindex`.asInstanceOf[js.Any])
    if (`aria-rowspan` != null) __obj.updateDynamic("aria-rowspan")(`aria-rowspan`.asInstanceOf[js.Any])
    if (!js.isUndefined(`aria-selected`)) __obj.updateDynamic("aria-selected")(`aria-selected`.asInstanceOf[js.Any])
    if (`aria-setsize` != null) __obj.updateDynamic("aria-setsize")(`aria-setsize`.asInstanceOf[js.Any])
    if (`aria-sort` != null) __obj.updateDynamic("aria-sort")(`aria-sort`.asInstanceOf[js.Any])
    if (`aria-valuemax` != null) __obj.updateDynamic("aria-valuemax")(`aria-valuemax`.asInstanceOf[js.Any])
    if (`aria-valuemin` != null) __obj.updateDynamic("aria-valuemin")(`aria-valuemin`.asInstanceOf[js.Any])
    if (`aria-valuenow` != null) __obj.updateDynamic("aria-valuenow")(`aria-valuenow`.asInstanceOf[js.Any])
    if (`aria-valuetext` != null) __obj.updateDynamic("aria-valuetext")(`aria-valuetext`.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (componentId != null) __obj.updateDynamic("componentId")(componentId.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (customWidth != null) __obj.updateDynamic("customWidth")(customWidth.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (elementToFocusOnDismiss != null) __obj.updateDynamic("elementToFocusOnDismiss")(elementToFocusOnDismiss.asInstanceOf[js.Any])
    if (firstFocusableSelector != null) __obj.updateDynamic("firstFocusableSelector")(firstFocusableSelector.asInstanceOf[js.Any])
    if (focusTrapZoneProps != null) __obj.updateDynamic("focusTrapZoneProps")(focusTrapZoneProps.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFocusInsideTrap)) __obj.updateDynamic("forceFocusInsideTrap")(forceFocusInsideTrap.asInstanceOf[js.Any])
    if (!js.isUndefined(hasCloseButton)) __obj.updateDynamic("hasCloseButton")(hasCloseButton.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerText != null) __obj.updateDynamic("headerText")(headerText.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreExternalFocusing)) __obj.updateDynamic("ignoreExternalFocusing")(ignoreExternalFocusing.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (!js.isUndefined(isBlocking)) __obj.updateDynamic("isBlocking")(isBlocking.asInstanceOf[js.Any])
    if (!js.isUndefined(isFooterAtBottom)) __obj.updateDynamic("isFooterAtBottom")(isFooterAtBottom.asInstanceOf[js.Any])
    if (!js.isUndefined(isHiddenOnDismiss)) __obj.updateDynamic("isHiddenOnDismiss")(isHiddenOnDismiss.asInstanceOf[js.Any])
    if (!js.isUndefined(isLightDismiss)) __obj.updateDynamic("isLightDismiss")(isLightDismiss.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (layerProps != null) __obj.updateDynamic("layerProps")(layerProps.asInstanceOf[js.Any])
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationIteration != null) __obj.updateDynamic("onAnimationIteration")(js.Any.fromFunction1(onAnimationIteration))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (onAuxClick != null) __obj.updateDynamic("onAuxClick")(js.Any.fromFunction1(onAuxClick))
    if (onBeforeInput != null) __obj.updateDynamic("onBeforeInput")(js.Any.fromFunction1(onBeforeInput))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(js.Any.fromFunction1(onCompositionEnd))
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(js.Any.fromFunction1(onCompositionStart))
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(js.Any.fromFunction1(onCompositionUpdate))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onCopy != null) __obj.updateDynamic("onCopy")(js.Any.fromFunction1(onCopy))
    if (onCut != null) __obj.updateDynamic("onCut")(js.Any.fromFunction1(onCut))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (onDismissed != null) __obj.updateDynamic("onDismissed")(js.Any.fromFunction0(onDismissed))
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(js.Any.fromFunction1(onDoubleClick))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(js.Any.fromFunction1(onDragExit))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(js.Any.fromFunction1(onEncrypted))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInvalid != null) __obj.updateDynamic("onInvalid")(js.Any.fromFunction1(onInvalid))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onLightDismissClick != null) __obj.updateDynamic("onLightDismissClick")(js.Any.fromFunction0(onLightDismissClick))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (onOpened != null) __obj.updateDynamic("onOpened")(js.Any.fromFunction0(onOpened))
    if (onOuterClick != null) __obj.updateDynamic("onOuterClick")(js.Any.fromFunction0(onOuterClick))
    if (onPaste != null) __obj.updateDynamic("onPaste")(js.Any.fromFunction1(onPaste))
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onRenderBody != null) __obj.updateDynamic("onRenderBody")(js.Any.fromFunction2(onRenderBody))
    if (onRenderFooter != null) __obj.updateDynamic("onRenderFooter")(js.Any.fromFunction2(onRenderFooter))
    if (onRenderFooterContent != null) __obj.updateDynamic("onRenderFooterContent")(js.Any.fromFunction2(onRenderFooterContent))
    if (onRenderHeader != null) __obj.updateDynamic("onRenderHeader")(onRenderHeader.asInstanceOf[js.Any])
    if (onRenderNavigation != null) __obj.updateDynamic("onRenderNavigation")(js.Any.fromFunction2(onRenderNavigation))
    if (onRenderNavigationContent != null) __obj.updateDynamic("onRenderNavigationContent")(js.Any.fromFunction2(onRenderNavigationContent))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(js.Any.fromFunction1(onTouchCancel))
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(js.Any.fromFunction1(onTouchEnd))
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(js.Any.fromFunction1(onTouchMove))
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(js.Any.fromFunction1(onTouchStart))
    if (onTransitionEnd != null) __obj.updateDynamic("onTransitionEnd")(js.Any.fromFunction1(onTransitionEnd))
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (overlayProps != null) __obj.updateDynamic("overlayProps")(overlayProps.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelProps]
  }
}

