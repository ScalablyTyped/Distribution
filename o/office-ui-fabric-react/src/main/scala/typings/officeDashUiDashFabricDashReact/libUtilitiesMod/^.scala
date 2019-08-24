package typings.officeDashUiDashFabricDashReact.libUtilitiesMod

import typings.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typings.atUifabricMergeDashStyles.libIStyleSetMod.IProcessedStyleSet
import typings.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import typings.atUifabricUtilities.Anon_AsyncPlaceholder
import typings.atUifabricUtilities.Anon_Configurable
import typings.atUifabricUtilities.Anon_Focus
import typings.atUifabricUtilities.libAsAsyncMod.IAsAsyncOptions
import typings.atUifabricUtilities.libBaseComponentDotTypesMod.IBaseProps
import typings.atUifabricUtilities.libClassNamesFunctionMod.IClassNamesFunctionOptions
import typings.atUifabricUtilities.libCssMod.ICssInput
import typings.atUifabricUtilities.libCustomizationsCustomizationsMod.ISettings
import typings.atUifabricUtilities.libCustomizationsCustomizationsMod.ISettingsFunction
import typings.atUifabricUtilities.libCustomizationsCustomizerContextMod.ICustomizerContext
import typings.atUifabricUtilities.libCustomizationsCustomizerDotTypesMod.ICustomizerProps
import typings.atUifabricUtilities.libDomIVirtualElementMod.IVirtualElement
import typings.atUifabricUtilities.libIPointMod.IPoint
import typings.atUifabricUtilities.libIRectangleMod.IRectangle
import typings.atUifabricUtilities.libISizeMod.ISize
import typings.atUifabricUtilities.libMathMod.IFitContentToBoundsOptions
import typings.atUifabricUtilities.libStyledMod.ICustomizableProps
import typings.atUifabricUtilities.libStyledMod.IPropsWithStyles
import typings.atUifabricUtilities.libWarnWarnControlledUsageMod.IWarnControlledUsageParams
import typings.atUifabricUtilities.libWarnWarnMod.ISettingsMap
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactNumbers.`false`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.`data-is-scrollable`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.`data-no-horizontal-wrap`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.`data-no-vertical-wrap`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.`data-portal-element`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.`ms-Fabric--isFocusVisible`
import typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.change
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.ComponentType
import typings.react.reactMod.Context
import typings.react.reactMod.ForwardRefExoticComponent
import typings.react.reactMod.PropsWithoutRef
import typings.react.reactMod.StatelessComponent
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.Partial
import typings.std.TypedPropertyDescriptor
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Utilities", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CustomizerContext: Context[ICustomizerContext] = js.native
  val DATA_IS_SCROLLABLE_ATTRIBUTE: `data-is-scrollable` = js.native
  val DATA_PORTAL_ATTRIBUTE: `data-portal-element` = js.native
  val IsFocusVisibleClassName: `ms-Fabric--isFocusVisible` = js.native
  val SELECTION_CHANGE: change = js.native
  val anchorProperties: js.Array[String] = js.native
  val audioProperties: js.Array[String] = js.native
  val baseElementEvents: js.Array[String] = js.native
  val baseElementProperties: js.Array[String] = js.native
  val buttonProperties: js.Array[String] = js.native
  val colGroupProperties: js.Array[String] = js.native
  val colProperties: js.Array[String] = js.native
  val divProperties: js.Array[String] = js.native
  val formProperties: js.Array[String] = js.native
  val htmlElementProperties: js.Array[String] = js.native
  val iframeProperties: js.Array[String] = js.native
  val imageProperties: js.Array[String] = js.native
  val imgProperties: js.Array[String] = js.native
  val inputProperties: js.Array[String] = js.native
  val labelProperties: js.Array[String] = js.native
  val liProperties: js.Array[String] = js.native
  val olProperties: js.Array[String] = js.native
  val optionProperties: js.Array[String] = js.native
  val selectProperties: js.Array[String] = js.native
  val tableProperties: js.Array[String] = js.native
  val tdProperties: js.Array[String] = js.native
  val textAreaProperties: js.Array[String] = js.native
  val thProperties: js.Array[String] = js.native
  val trProperties: js.Array[String] = js.native
  val videoProperties: js.Array[String] = js.native
  def addDirectionalKeyCode(which: Double): Unit = js.native
  def addElementAtIndex[T](array: js.Array[T], index: Double, itemToAdd: T): js.Array[T] = js.native
  def allowScrollOnElement(element: Null, events: typings.atUifabricUtilities.libEventGroupMod.EventGroup): Unit = js.native
  def allowScrollOnElement(element: HTMLElement, events: typings.atUifabricUtilities.libEventGroupMod.EventGroup): Unit = js.native
  def appendFunction(parent: js.Any, functions: js.Any*): js.Function0[Unit] = js.native
  def arraysEqual[T](array1: js.Array[T], array2: js.Array[T]): Boolean = js.native
  def asAsync[TProps](options: IAsAsyncOptions[TProps]): ForwardRefExoticComponent[PropsWithoutRef[TProps with Anon_AsyncPlaceholder]] = js.native
  def assertNever(x: scala.Nothing): scala.Nothing = js.native
  def assign(target: js.Any, args: js.Any*): js.Any = js.native
  def calculatePrecision(value: String): Double = js.native
  def calculatePrecision(value: Double): Double = js.native
  def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: IStyleSet[TStyleSet] */](): js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ] = js.native
  def classNamesFunction[TStyleProps /* <: js.Object */, TStyleSet /* <: IStyleSet[TStyleSet] */](options: IClassNamesFunctionOptions): js.Function2[
    /* getStyles */ js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]], 
    /* styleProps */ js.UndefOr[TStyleProps], 
    IProcessedStyleSet[TStyleSet]
  ] = js.native
  def createArray[T](size: Double, getItem: js.Function1[/* index */ Double, T]): js.Array[T] = js.native
  def css(args: ICssInput*): String = js.native
  def customizable(scope: String, fields: js.Array[String]): js.Function1[/* ComposedComponent */ ComponentType[_], _] = js.native
  def customizable(scope: String, fields: js.Array[String], concatStyles: Boolean): js.Function1[/* ComposedComponent */ ComponentType[_], _] = js.native
  def disableBodyScroll(): Unit = js.native
  def doesElementContainFocus(element: HTMLElement): Boolean = js.native
  def elementContains(): Boolean = js.native
  def elementContains(parent: Null, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: Null, child: HTMLElement): Boolean = js.native
  def elementContains(parent: Null, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: HTMLElement): Boolean = js.native
  def elementContains(parent: HTMLElement, child: Null, allowVirtualParents: Boolean): Boolean = js.native
  def elementContains(parent: HTMLElement, child: HTMLElement): Boolean = js.native
  def elementContains(parent: HTMLElement, child: HTMLElement, allowVirtualParents: Boolean): Boolean = js.native
  def elementContainsAttribute(element: HTMLElement, attribute: String): String | Null = js.native
  def enableBodyScroll(): Unit = js.native
  def extendComponent[T /* <: Component[js.Object, js.Object, _] */](
    parent: T,
    methods: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in keyof T ]:? T[key]}
    */ typings.officeDashUiDashFabricDashReact.officeDashUiDashFabricDashReactStrings.extendComponent with T
  ): Unit = js.native
  def filteredAssign(isAllowed: js.Function1[/* propName */ String, Boolean], target: js.Any, args: js.Any*): js.Any = js.native
  def find[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean]): js.UndefOr[T] = js.native
  def findElementRecursive(element: Null, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = js.native
  def findElementRecursive(element: HTMLElement, matchFunction: js.Function1[/* element */ HTMLElement, Boolean]): HTMLElement | Null = js.native
  def findIndex[T](array: js.Array[T], cb: js.Function2[/* item */ T, /* index */ Double, Boolean]): Double = js.native
  def findScrollableParent(): HTMLElement | Null = js.native
  def findScrollableParent(startingElement: HTMLElement): HTMLElement | Null = js.native
  def fitContentToBounds(options: IFitContentToBoundsOptions): ISize = js.native
  def flatten[T](array: js.Array[T | js.Array[T]]): js.Array[T] = js.native
  def focusAsync(): Unit = js.native
  def focusAsync(element: Anon_Focus): Unit = js.native
  def focusAsync(element: HTMLElement): Unit = js.native
  def focusFirstChild(rootElement: HTMLElement): Boolean = js.native
  def format(s: String, values: js.Any*): String = js.native
  def getChildren(parent: HTMLElement): js.Array[HTMLElement] = js.native
  def getChildren(parent: HTMLElement, allowVirtualChildren: Boolean): js.Array[HTMLElement] = js.native
  def getDistanceBetweenPoints(point1: IPoint, point2: IPoint): Double = js.native
  def getDocument(): js.UndefOr[Document] = js.native
  def getDocument(rootElement: HTMLElement): js.UndefOr[Document] = js.native
  def getElementIndexPath(fromElement: HTMLElement, toElement: HTMLElement): js.Array[Double] = js.native
  def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getFirstFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getFirstTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  def getFirstTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  def getFocusableByIndexPath(parent: HTMLElement, path: js.Array[Double]): js.UndefOr[HTMLElement] = js.native
  def getId(): String = js.native
  def getId(prefix: String): String = js.native
  def getInitials(displayName: js.UndefOr[scala.Nothing], isRtl: Boolean): String = js.native
  def getInitials(displayName: js.UndefOr[scala.Nothing], isRtl: Boolean, allowPhoneInitials: Boolean): String = js.native
  def getInitials(displayName: String, isRtl: Boolean): String = js.native
  def getInitials(displayName: String, isRtl: Boolean, allowPhoneInitials: Boolean): String = js.native
  def getInitials(displayName: Null, isRtl: Boolean): String = js.native
  def getInitials(displayName: Null, isRtl: Boolean, allowPhoneInitials: Boolean): String = js.native
  def getLanguage(): String | Null = js.native
  def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getLastFocusable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement): HTMLElement | Null = js.native
  def getLastTabbable(rootElement: HTMLElement, currentElement: HTMLElement, includeElementsInFocusZones: Boolean): HTMLElement | Null = js.native
  def getLastTabbable(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    includeElementsInFocusZones: Boolean,
    checkNode: Boolean
  ): HTMLElement | Null = js.native
  def getNativeProps[T](props: js.Object, allowedPropNames: js.Array[String]): T = js.native
  def getNativeProps[T](props: js.Object, allowedPropNames: js.Array[String], excludedPropNames: js.Array[String]): T = js.native
  def getNextElement(
    rootElement: HTMLElement,
    currentElement: Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    suppressChildTraversal: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = js.native
  def getNextElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    suppressChildTraversal: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = js.native
  def getParent(child: HTMLElement): HTMLElement | Null = js.native
  def getParent(child: HTMLElement, allowVirtualParents: Boolean): HTMLElement | Null = js.native
  def getPreviousElement(
    rootElement: HTMLElement,
    currentElement: Null,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    traverseChildren: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = js.native
  def getPreviousElement(
    rootElement: HTMLElement,
    currentElement: HTMLElement,
    checkNode: js.UndefOr[Boolean],
    suppressParentTraversal: js.UndefOr[Boolean],
    traverseChildren: js.UndefOr[Boolean],
    includeElementsInFocusZones: js.UndefOr[Boolean],
    allowFocusRoot: js.UndefOr[Boolean],
    tabbable: js.UndefOr[Boolean]
  ): HTMLElement | Null = js.native
  def getRTL(): Boolean = js.native
  def getRTLSafeKeyCode(key: Double): Double = js.native
  def getRect(): js.UndefOr[IRectangle] = js.native
  def getRect(element: HTMLElement): js.UndefOr[IRectangle] = js.native
  def getRect(element: Window): js.UndefOr[IRectangle] = js.native
  def getResourceUrl(url: String): String = js.native
  def getScrollbarWidth(): Double = js.native
  def getVirtualParent(child: HTMLElement): js.UndefOr[HTMLElement] = js.native
  def getWindow(): js.UndefOr[Window] = js.native
  def getWindow(rootElement: Element): js.UndefOr[Window] = js.native
  def hasHorizontalOverflow(element: HTMLElement): Boolean = js.native
  def hasOverflow(element: HTMLElement): Boolean = js.native
  def hasVerticalOverflow(element: HTMLElement): Boolean = js.native
  def hoistMethods(destination: js.Any, source: js.Any): js.Array[String] = js.native
  def hoistMethods(destination: js.Any, source: js.Any, exclusions: js.Array[String]): js.Array[String] = js.native
  def hoistStatics[TSource /* <: js.Object */, TDest](source: TSource, dest: TDest): TDest = js.native
  def initializeComponentRef[TProps /* <: IBaseProps[_] */, TState](obj: Component[TProps, TState, _]): Unit = js.native
  def initializeFocusRects(): Unit = js.native
  def initializeFocusRects(window: Window): Unit = js.native
  def isControlled[P](props: P, valueProp: String): Boolean = js.native
  def isDirectionalKeyCode(which: Double): Boolean = js.native
  def isElementFocusSubZone(): Boolean = js.native
  def isElementFocusSubZone(element: HTMLElement): Boolean = js.native
  def isElementFocusZone(): Boolean = js.native
  def isElementFocusZone(element: HTMLElement): Boolean = js.native
  def isElementTabbable(element: HTMLElement): Boolean = js.native
  def isElementTabbable(element: HTMLElement, checkTabIndex: Boolean): Boolean = js.native
  def isElementVisible(): Boolean = js.native
  def isElementVisible(element: HTMLElement): Boolean = js.native
  def isIE11(): Boolean = js.native
  def isIOS(): Boolean = js.native
  def isMac(): Boolean = js.native
  def isMac(reset: Boolean): Boolean = js.native
  def isVirtualElement(element: IVirtualElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ Boolean = js.native
  def isVirtualElement(element: HTMLElement): /* is @uifabric/utilities.@uifabric/utilities/lib/dom/IVirtualElement.IVirtualElement */ Boolean = js.native
  def mapEnumByName[T](
    theEnum: js.Any,
    callback: js.Function2[
      /* name */ js.UndefOr[String], 
      /* value */ js.UndefOr[String | Double], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[js.Array[js.UndefOr[T]]] = js.native
  def memoize[T /* <: js.Function */](target: js.Any, key: String, descriptor: TypedPropertyDescriptor[T]): Anon_Configurable[T] = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RET_TYPE] */, RET_TYPE](cb: T): T = js.native
  def memoizeFunction[T /* <: js.Function1[/* repeated */ js.Any, RET_TYPE] */, RET_TYPE](cb: T, maxCacheSize: Double): T = js.native
  def mergeAriaAttributeValues(ariaAttributes: js.UndefOr[String]*): js.UndefOr[String] = js.native
  def mergeCustomizations(props: ICustomizerProps, parentContext: ICustomizerContext): ICustomizerContext = js.native
  def mergeScopedSettings(): ISettings = js.native
  def mergeScopedSettings(oldSettings: ISettings): ISettings = js.native
  def mergeScopedSettings(oldSettings: ISettings, newSettings: ISettings): ISettings = js.native
  def mergeScopedSettings(oldSettings: ISettings, newSettings: ISettingsFunction): ISettings = js.native
  def mergeSettings(): ISettings = js.native
  def mergeSettings(oldSettings: ISettings): ISettings = js.native
  def mergeSettings(oldSettings: ISettings, newSettings: ISettings): ISettings = js.native
  def mergeSettings(oldSettings: ISettings, newSettings: ISettingsFunction): ISettings = js.native
  @JSName("merge")
  def merge_false[T](target: Partial[T], args: (js.UndefOr[Partial[T] | Null | `false`])*): T = js.native
  def nullRender(): typings.react.reactMod.Global.JSXNs.Element | Null = js.native
  def on(element: Element, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  def on(
    element: Element,
    eventName: String,
    callback: js.Function1[/* ev */ Event, Unit],
    options: Boolean
  ): js.Function0[Unit] = js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit]): js.Function0[Unit] = js.native
  def on(element: Window, eventName: String, callback: js.Function1[/* ev */ Event, Unit], options: Boolean): js.Function0[Unit] = js.native
  def portalContainsElement(target: HTMLElement): Boolean = js.native
  def portalContainsElement(target: HTMLElement, parent: HTMLElement): Boolean = js.native
  def precisionRound(value: Double, precision: Double): Double = js.native
  def precisionRound(value: Double, precision: Double, base: Double): Double = js.native
  def raiseClick(target: Element): Unit = js.native
  def removeIndex[T](array: js.Array[T], index: Double): js.Array[T] = js.native
  def replaceElement[T](array: js.Array[T], newElement: T, index: Double): js.Array[T] = js.native
  def resetControlledWarnings(): Unit = js.native
  def resetIds(): Unit = js.native
  def resetIds(counter: Double): Unit = js.native
  def resetMemoizations(): Unit = js.native
  def safeRequestAnimationFrame(component: Component[js.Object, js.Object, _]): js.Function1[/* cb */ js.Function, Unit] = js.native
  def safeSetTimeout(component: Component[js.Object, js.Object, _]): js.Function2[/* cb */ js.Function, /* duration */ Double, Unit] = js.native
  def setBaseUrl(baseUrl: String): Unit = js.native
  def setFocusVisibility(enabled: Boolean): Unit = js.native
  def setFocusVisibility(enabled: Boolean, target: Element): Unit = js.native
  def setLanguage(language: String): Unit = js.native
  def setLanguage(language: String, avoidPersisting: Boolean): Unit = js.native
  def setMemoizeWeakMap(weakMap: js.Any): Unit = js.native
  def setPortalAttribute(element: HTMLElement): Unit = js.native
  def setRTL(isRTL: Boolean): Unit = js.native
  def setRTL(isRTL: Boolean, persistSetting: Boolean): Unit = js.native
  def setSSR(isEnabled: Boolean): Unit = js.native
  def setVirtualParent(child: HTMLElement, parent: HTMLElement): Unit = js.native
  def setWarningCallback(): Unit = js.native
  def setWarningCallback(warningCallback: js.Function1[/* message */ String, Unit]): Unit = js.native
  def shallowCompare[TA, TB](a: TA, b: TB): Boolean = js.native
  @JSName("shouldWrapFocus")
  def shouldWrapFocus_datanohorizontalwrap(element: HTMLElement, noWrapDataAttribute: `data-no-horizontal-wrap`): Boolean = js.native
  @JSName("shouldWrapFocus")
  def shouldWrapFocus_datanoverticalwrap(element: HTMLElement, noWrapDataAttribute: `data-no-vertical-wrap`): Boolean = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): StatelessComponent[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): StatelessComponent[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): StatelessComponent[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: ComponentClass[TComponentProps, ComponentState],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): StatelessComponent[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ): StatelessComponent[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]]
  ): StatelessComponent[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps
  ): StatelessComponent[TComponentProps] = js.native
  def styled[TComponentProps /* <: IPropsWithStyles[TStyleProps, TStyleSet] */, TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](
    Component: StatelessComponent[TComponentProps],
    baseStyles: IStyleFunctionOrObject[TStyleProps, TStyleSet],
    getProps: js.Function1[/* props */ TComponentProps, Partial[TComponentProps]],
    customizable: ICustomizableProps,
    pure: Boolean
  ): StatelessComponent[TComponentProps] = js.native
  def toMatrix[T](items: js.Array[T], columnCount: Double): js.Array[js.Array[T]] = js.native
  def unhoistMethods(source: js.Any, methodNames: js.Array[String]): Unit = js.native
  def values[T](obj: js.Any): js.Array[T] = js.native
  def warn(message: String): Unit = js.native
  def warnConditionallyRequiredProps[P](
    componentName: String,
    props: P,
    requiredProps: js.Array[String],
    conditionalPropName: String,
    condition: Boolean
  ): Unit = js.native
  def warnControlledUsage[P](params: IWarnControlledUsageParams[P]): Unit = js.native
  def warnDeprecations[P](componentName: String, props: P, deprecationMap: ISettingsMap[P]): Unit = js.native
  def warnMutuallyExclusive[P](componentName: String, props: P, exclusiveMap: ISettingsMap[P]): Unit = js.native
}

