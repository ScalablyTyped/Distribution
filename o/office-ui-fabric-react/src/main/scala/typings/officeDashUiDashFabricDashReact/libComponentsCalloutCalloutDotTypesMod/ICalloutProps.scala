package typings.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typings.atUifabricUtilities.libIRectangleMod.IRectangle
import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.officeDashUiDashFabricDashReact.libComponentsLayerLayerDotTypesMod.ILayerProps
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.ICalloutPositionedInfo
import typings.react.Anon_Html
import typings.react.NativeMouseEvent
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
import typings.react.reactMod.PointerEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.react.reactMod.TouchEvent
import typings.react.reactMod.TransitionEvent
import typings.react.reactMod.WheelEvent
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
import typings.std.HTMLDivElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalloutProps extends HTMLAttributes[HTMLDivElement] {
  /**
    * If true the positioning logic will prefer to flip edges rather than to nudge the rectangle to fit within bounds,
    * thus making sure the element aligns perfectly with target's alignment edge
    */
  var alignTargetEdge: js.UndefOr[Boolean] = js.undefined
  /**
    * Defines the element id referencing the element containing the description for the callout.
    */
  var ariaDescribedBy: js.UndefOr[String] = js.undefined
  /**
    * Accessible label text for callout.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    *  Defines the element id referencing the element containing label text for callout.
    */
  var ariaLabelledBy: js.UndefOr[String] = js.undefined
  /**
    * The background color of the Callout in hex format ie. #ffffff.
    * @defaultvalue $ms-color-white
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * The width of the beak.
    * @defaultvalue 16
    */
  var beakWidth: js.UndefOr[Double] = js.undefined
  /**
    * The bounding rectangle (or callback that returns a rectangle) for which  the contextual menu can appear in.
    */
  var bounds: js.UndefOr[
    IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window], 
      js.UndefOr[IRectangle]
    ])
  ] = js.undefined
  /**
    * Set max height of callout
    * When not set the callout will expand with contents up to the bottom of the screen
    */
  var calloutMaxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Custom width for callout including borders. If value is 0, no width is applied.
    * @defaultvalue 0
    */
  var calloutMaxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Custom width for callout including borders. If value is 0, no width is applied.
    * @defaultvalue 0
    */
  var calloutWidth: js.UndefOr[Double] = js.undefined
  /**
    * If true the position returned will have the menu element cover the target.
    * If false then it will position next to the target;
    * @defaultvalue false
    */
  var coverTarget: js.UndefOr[Boolean] = js.undefined
  /**
    * How the element should be positioned
    * @defaultvalue DirectionalHint.BottomAutoEdge
    */
  var directionalHint: js.UndefOr[DirectionalHint] = js.undefined
  /**
    * If true the position will not change sides in an attempt to fit the callout within bounds.
    * It will still attempt to align it to whatever bounds are given.
    * @defaultvalue false
    */
  var directionalHintFixed: js.UndefOr[Boolean] = js.undefined
  /**
    * How the element should be positioned in RTL layouts.
    * If not specified, a mirror of `directionalHint` will be used instead
    */
  var directionalHintForRTL: js.UndefOr[DirectionalHint] = js.undefined
  /**
    * If true do not render on a new layer. If false render on a new layer.
    */
  var doNotLayer: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the final height of the content.
    * To be used when expanding the content dynamically so that callout can adjust its position.
    */
  var finalHeight: js.UndefOr[Double] = js.undefined
  /**
    * The gap between the Callout and the target
    * @defaultvalue 0
    */
  var gapSpace: js.UndefOr[Double] = js.undefined
  /**
    * Manually set OverflowYHidden style prop to true on calloutMain element
    * A variety of callout load animations will need this to hide the scollbar that can appear
    */
  var hideOverflow: js.UndefOr[Boolean] = js.undefined
  /**
    * If true then the beak is visible. If false it will not be shown.
    * @defaultvalue true
    */
  var isBeakVisible: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional props to pass to the Layer component hosting the panel.
    */
  var layerProps: js.UndefOr[ILayerProps] = js.undefined
  /**
    * The minimum distance the callout will be away from the edge of the screen.
    *  @defaultvalue 8
    */
  var minPagePadding: js.UndefOr[Double] = js.undefined
  /**
    * Callback when the Callout tries to close.
    */
  var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[js.Any], Unit]] = js.undefined
  /**
    * Optional callback when the layer content has mounted.
    */
  var onLayerMounted: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Optional callback that is called once the callout has been correctly positioned.
    * @param positions - Gives the user information about how the callout is positioned such as the
    * final edge of the target that it positioned against, the beak position, and the beaks relationship to the
    * edges of the callout.
    */
  var onPositioned: js.UndefOr[js.Function1[/* positions */ js.UndefOr[ICalloutPositionedInfo], Unit]] = js.undefined
  /**
    * Callback when the Callout body is scrolled.
    */
  @JSName("onScroll")
  var onScroll_ICalloutProps: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * If true then the callout will not dismiss when it loses focus
    * @defaultvalue false
    */
  var preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * If true then the callout will not dismiss on resize
    * @defaultvalue false
    */
  var preventDismissOnResize: js.UndefOr[Boolean] = js.undefined
  /**
    * If true then the callout will not dismiss on scroll
    * @defaultvalue false
    */
  var preventDismissOnScroll: js.UndefOr[Boolean] = js.undefined
  /**
    * If true then the callout will attempt to focus the first focusable element that it contains.
    * If it doesn't find an element, no focus will be set and the method will return false.
    * This means that it's the contents responsibility to either set focus or have
    * focusable items.
    * @returns True if focus was set, false if it was not.
    */
  var setInitialFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * If specified, determines whether the underlying "Popup" component should try to restore
    * focus when it is dismissed.  When set to false, the Popup won't try to restore focus to
    * the last focused element.
    * @defaultvalue true;
    */
  var shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the component will be updated even when hidden=true.
    * Note that this would consume resources to update even though
    * nothing is being shown to the user.
    * This might be helpful though if your updates are small and you want the
    * callout to be revealed fast to the user when hidden is set to false.
    */
  var shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional styles for the component.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[ICalloutContentStyleProps, ICalloutContentStyles]] = js.undefined
  /**
    * The target that the Callout should try to position itself based on.
    * It can be either an Element a querySelector string of a valid Element
    * or a MouseEvent. If MouseEvent is given then the origin point of the event will be used.
    */
  var target: js.UndefOr[Target] = js.undefined
  /**
    * Optional theme for component
    */
  var theme: js.UndefOr[ITheme] = js.undefined
}

object ICalloutProps {
  @scala.inline
  def apply(
    about: String = null,
    accessKey: String = null,
    alignTargetEdge: js.UndefOr[Boolean] = js.undefined,
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
    ariaDescribedBy: String = null,
    ariaLabel: String = null,
    ariaLabelledBy: String = null,
    autoCapitalize: String = null,
    autoCorrect: String = null,
    autoSave: String = null,
    backgroundColor: String = null,
    beakWidth: Int | Double = null,
    bounds: IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window], 
      js.UndefOr[IRectangle]
    ]) = null,
    calloutMaxHeight: Int | Double = null,
    calloutMaxWidth: Int | Double = null,
    calloutWidth: Int | Double = null,
    children: ReactNode = null,
    className: String = null,
    color: String = null,
    contentEditable: js.UndefOr[Boolean] = js.undefined,
    contextMenu: String = null,
    coverTarget: js.UndefOr[Boolean] = js.undefined,
    dangerouslySetInnerHTML: Anon_Html = null,
    datatype: String = null,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String | Double | js.Array[String] = null,
    dir: String = null,
    directionalHint: DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    directionalHintForRTL: DirectionalHint = null,
    doNotLayer: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    finalHeight: Int | Double = null,
    gapSpace: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hideOverflow: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inlist: js.Any = null,
    inputMode: none | text | tel | url | email | numeric | decimal | search = null,
    is: String = null,
    isBeakVisible: js.UndefOr[Boolean] = js.undefined,
    itemID: String = null,
    itemProp: String = null,
    itemRef: String = null,
    itemScope: js.UndefOr[Boolean] = js.undefined,
    itemType: String = null,
    lang: String = null,
    layerProps: ILayerProps = null,
    minPagePadding: Int | Double = null,
    onAbort: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onAnimationEnd: AnimationEvent[HTMLDivElement] => Unit = null,
    onAnimationIteration: AnimationEvent[HTMLDivElement] => Unit = null,
    onAnimationStart: AnimationEvent[HTMLDivElement] => Unit = null,
    onAuxClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onBeforeInput: FormEvent[HTMLDivElement] => Unit = null,
    onBlur: FocusEvent[HTMLDivElement] => Unit = null,
    onCanPlay: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onCanPlayThrough: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onChange: FormEvent[HTMLDivElement] => Unit = null,
    onClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onCompositionEnd: CompositionEvent[HTMLDivElement] => Unit = null,
    onCompositionStart: CompositionEvent[HTMLDivElement] => Unit = null,
    onCompositionUpdate: CompositionEvent[HTMLDivElement] => Unit = null,
    onContextMenu: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onCopy: ClipboardEvent[HTMLDivElement] => Unit = null,
    onCut: ClipboardEvent[HTMLDivElement] => Unit = null,
    onDismiss: /* ev */ js.UndefOr[js.Any] => Unit = null,
    onDoubleClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onDrag: DragEvent[HTMLDivElement] => Unit = null,
    onDragEnd: DragEvent[HTMLDivElement] => Unit = null,
    onDragEnter: DragEvent[HTMLDivElement] => Unit = null,
    onDragExit: DragEvent[HTMLDivElement] => Unit = null,
    onDragLeave: DragEvent[HTMLDivElement] => Unit = null,
    onDragOver: DragEvent[HTMLDivElement] => Unit = null,
    onDragStart: DragEvent[HTMLDivElement] => Unit = null,
    onDrop: DragEvent[HTMLDivElement] => Unit = null,
    onDurationChange: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onEmptied: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onEncrypted: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onEnded: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onError: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onFocus: FocusEvent[HTMLDivElement] => Unit = null,
    onInput: FormEvent[HTMLDivElement] => Unit = null,
    onInvalid: FormEvent[HTMLDivElement] => Unit = null,
    onKeyDown: KeyboardEvent[HTMLDivElement] => Unit = null,
    onKeyPress: KeyboardEvent[HTMLDivElement] => Unit = null,
    onKeyUp: KeyboardEvent[HTMLDivElement] => Unit = null,
    onLayerMounted: () => Unit = null,
    onLoad: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onLoadStart: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onLoadedData: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onLoadedMetadata: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onMouseDown: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseEnter: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseLeave: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseMove: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseOut: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseOver: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onMouseUp: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    onPaste: ClipboardEvent[HTMLDivElement] => Unit = null,
    onPause: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onPlay: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onPlaying: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onPointerCancel: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerDown: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerEnter: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerLeave: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerMove: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerOut: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerOver: PointerEvent[HTMLDivElement] => Unit = null,
    onPointerUp: PointerEvent[HTMLDivElement] => Unit = null,
    onPositioned: /* positions */ js.UndefOr[ICalloutPositionedInfo] => Unit = null,
    onProgress: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onRateChange: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onReset: FormEvent[HTMLDivElement] => Unit = null,
    onScroll: () => Unit = null,
    onSeeked: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onSeeking: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onSelect: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onStalled: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onSubmit: FormEvent[HTMLDivElement] => Unit = null,
    onSuspend: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onTimeUpdate: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onTouchCancel: TouchEvent[HTMLDivElement] => Unit = null,
    onTouchEnd: TouchEvent[HTMLDivElement] => Unit = null,
    onTouchMove: TouchEvent[HTMLDivElement] => Unit = null,
    onTouchStart: TouchEvent[HTMLDivElement] => Unit = null,
    onTransitionEnd: TransitionEvent[HTMLDivElement] => Unit = null,
    onVolumeChange: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onWaiting: SyntheticEvent[HTMLDivElement, Event] => Unit = null,
    onWheel: WheelEvent[HTMLDivElement] => Unit = null,
    placeholder: String = null,
    prefix: String = null,
    preventDismissOnLostFocus: js.UndefOr[Boolean] = js.undefined,
    preventDismissOnResize: js.UndefOr[Boolean] = js.undefined,
    preventDismissOnScroll: js.UndefOr[Boolean] = js.undefined,
    property: String = null,
    radioGroup: String = null,
    resource: String = null,
    results: Int | Double = null,
    role: String = null,
    security: String = null,
    setInitialFocus: js.UndefOr[Boolean] = js.undefined,
    shouldRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.undefined,
    slot: String = null,
    spellCheck: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    styles: IStyleFunctionOrObject[ICalloutContentStyleProps, ICalloutContentStyles] = null,
    suppressContentEditableWarning: js.UndefOr[Boolean] = js.undefined,
    suppressHydrationWarning: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    target: Target = null,
    theme: ITheme = null,
    title: String = null,
    translate: yes | no = null,
    typeof: String = null,
    unselectable: on | off = null,
    vocab: String = null
  ): ICalloutProps = {
    val __obj = js.Dynamic.literal()
    if (about != null) __obj.updateDynamic("about")(about.asInstanceOf[js.Any])
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(alignTargetEdge)) __obj.updateDynamic("alignTargetEdge")(alignTargetEdge.asInstanceOf[js.Any])
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
    if (ariaDescribedBy != null) __obj.updateDynamic("ariaDescribedBy")(ariaDescribedBy.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize.asInstanceOf[js.Any])
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect.asInstanceOf[js.Any])
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (calloutMaxHeight != null) __obj.updateDynamic("calloutMaxHeight")(calloutMaxHeight.asInstanceOf[js.Any])
    if (calloutMaxWidth != null) __obj.updateDynamic("calloutMaxWidth")(calloutMaxWidth.asInstanceOf[js.Any])
    if (calloutWidth != null) __obj.updateDynamic("calloutWidth")(calloutWidth.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget.asInstanceOf[js.Any])
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML.asInstanceOf[js.Any])
    if (datatype != null) __obj.updateDynamic("datatype")(datatype.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed.asInstanceOf[js.Any])
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotLayer)) __obj.updateDynamic("doNotLayer")(doNotLayer.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (finalHeight != null) __obj.updateDynamic("finalHeight")(finalHeight.asInstanceOf[js.Any])
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOverflow)) __obj.updateDynamic("hideOverflow")(hideOverflow.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inlist != null) __obj.updateDynamic("inlist")(inlist.asInstanceOf[js.Any])
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (!js.isUndefined(isBeakVisible)) __obj.updateDynamic("isBeakVisible")(isBeakVisible.asInstanceOf[js.Any])
    if (itemID != null) __obj.updateDynamic("itemID")(itemID.asInstanceOf[js.Any])
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp.asInstanceOf[js.Any])
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef.asInstanceOf[js.Any])
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope.asInstanceOf[js.Any])
    if (itemType != null) __obj.updateDynamic("itemType")(itemType.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (layerProps != null) __obj.updateDynamic("layerProps")(layerProps.asInstanceOf[js.Any])
    if (minPagePadding != null) __obj.updateDynamic("minPagePadding")(minPagePadding.asInstanceOf[js.Any])
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
    if (onLayerMounted != null) __obj.updateDynamic("onLayerMounted")(js.Any.fromFunction0(onLayerMounted))
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
    if (onPositioned != null) __obj.updateDynamic("onPositioned")(js.Any.fromFunction1(onPositioned))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction0(onScroll))
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
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDismissOnLostFocus)) __obj.updateDynamic("preventDismissOnLostFocus")(preventDismissOnLostFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDismissOnResize)) __obj.updateDynamic("preventDismissOnResize")(preventDismissOnResize.asInstanceOf[js.Any])
    if (!js.isUndefined(preventDismissOnScroll)) __obj.updateDynamic("preventDismissOnScroll")(preventDismissOnScroll.asInstanceOf[js.Any])
    if (property != null) __obj.updateDynamic("property")(property.asInstanceOf[js.Any])
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(setInitialFocus)) __obj.updateDynamic("setInitialFocus")(setInitialFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldRestoreFocus)) __obj.updateDynamic("shouldRestoreFocus")(shouldRestoreFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldUpdateWhenHidden)) __obj.updateDynamic("shouldUpdateWhenHidden")(shouldUpdateWhenHidden.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContentEditableWarning)) __obj.updateDynamic("suppressContentEditableWarning")(suppressContentEditableWarning.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHydrationWarning)) __obj.updateDynamic("suppressHydrationWarning")(suppressHydrationWarning.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (translate != null) __obj.updateDynamic("translate")(translate.asInstanceOf[js.Any])
    if (typeof != null) __obj.updateDynamic("typeof")(typeof.asInstanceOf[js.Any])
    if (unselectable != null) __obj.updateDynamic("unselectable")(unselectable.asInstanceOf[js.Any])
    if (vocab != null) __obj.updateDynamic("vocab")(vocab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalloutProps]
  }
}

