package typings.officeUiFabricReact.groupHeaderTypesMod

import typings.officeUiFabricReact.groupedListTypesMod.IGroup
import typings.officeUiFabricReact.groupedListTypesMod.IGroupDividerProps
import typings.officeUiFabricReact.withViewportMod.IViewport
import typings.react.mod.HTMLAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLButtonElement
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricStyling.ithemeMod.ITheme
import typings.uifabricUtilities.createRefMod.IRefObject
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import typings.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupHeaderProps extends IGroupDividerProps {
  /** Defines an element's number or position in the current set of listitems or treeitems */
  var ariaPosInSet: js.UndefOr[Double] = js.undefined
  /** Defines the number of items in the current set of listitems or treeitems */
  var ariaSetSize: js.UndefOr[Double] = js.undefined
  /** Defines the name of a custom icon to be used for group headers. If not set, the default icon will be used */
  var expandButtonIcon: js.UndefOr[String] = js.undefined
  /** GroupedList id for aria-controls */
  var groupedListId: js.UndefOr[String] = js.undefined
  /**
    * If provided, can be used to render a custom checkbox
    */
  var onRenderGroupHeaderCheckbox: js.UndefOr[IRenderFunction[IGroupHeaderCheckboxProps]] = js.undefined
  /** Native props for the GroupHeader select all button */
  var selectAllButtonProps: js.UndefOr[HTMLAttributes[HTMLButtonElement]] = js.undefined
  /** Style function to be passed in to override the themed or default styles */
  var styles: js.UndefOr[IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles]] = js.undefined
  /**
    * Whether to use fast icon and check components. The icons can't be targeted by customization
    * but are still customizable via class names.
    * @defaultvalue true
    */
  var useFastIcons: js.UndefOr[Boolean] = js.undefined
}

object IGroupHeaderProps {
  @scala.inline
  def apply(
    ariaPosInSet: js.UndefOr[Double] = js.undefined,
    ariaSetSize: js.UndefOr[Double] = js.undefined,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[js.Object] = null,
    expandButtonIcon: String = null,
    expandButtonProps: HTMLAttributes[HTMLButtonElement] = null,
    footerText: String = null,
    group: IGroup = null,
    groupIndex: js.UndefOr[Double] = js.undefined,
    groupLevel: js.UndefOr[Double] = js.undefined,
    groupedListId: String = null,
    groups: js.Array[IGroup] = null,
    indentWidth: js.UndefOr[Double] = js.undefined,
    isCollapsedGroupSelectVisible: js.UndefOr[Boolean] = js.undefined,
    isGroupLoading: /* group */ IGroup => Boolean = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    loadingText: String = null,
    onGroupHeaderClick: /* group */ IGroup => Unit = null,
    onRenderGroupHeaderCheckbox: (/* props */ js.UndefOr[IGroupHeaderCheckboxProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderCheckboxProps], Element | Null]]) => Element | Null = null,
    onRenderTitle: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IGroupHeaderProps], Element | Null]]) => Element | Null = null,
    onToggleCollapse: /* group */ IGroup => Unit = null,
    onToggleSelectGroup: /* group */ IGroup => Unit = null,
    onToggleSummarize: /* group */ IGroup => Unit = null,
    selectAllButtonProps: HTMLAttributes[HTMLButtonElement] = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectionMode: SelectionMode = null,
    showAllLinkText: String = null,
    styles: IStyleFunctionOrObject[IGroupHeaderStyleProps, IGroupHeaderStyles] = null,
    theme: ITheme = null,
    useFastIcons: js.UndefOr[Boolean] = js.undefined,
    viewport: IViewport = null
  ): IGroupHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ariaPosInSet)) __obj.updateDynamic("ariaPosInSet")(ariaPosInSet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ariaSetSize)) __obj.updateDynamic("ariaSetSize")(ariaSetSize.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.get.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (expandButtonIcon != null) __obj.updateDynamic("expandButtonIcon")(expandButtonIcon.asInstanceOf[js.Any])
    if (expandButtonProps != null) __obj.updateDynamic("expandButtonProps")(expandButtonProps.asInstanceOf[js.Any])
    if (footerText != null) __obj.updateDynamic("footerText")(footerText.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(groupIndex)) __obj.updateDynamic("groupIndex")(groupIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(groupLevel)) __obj.updateDynamic("groupLevel")(groupLevel.get.asInstanceOf[js.Any])
    if (groupedListId != null) __obj.updateDynamic("groupedListId")(groupedListId.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (!js.isUndefined(indentWidth)) __obj.updateDynamic("indentWidth")(indentWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsedGroupSelectVisible)) __obj.updateDynamic("isCollapsedGroupSelectVisible")(isCollapsedGroupSelectVisible.get.asInstanceOf[js.Any])
    if (isGroupLoading != null) __obj.updateDynamic("isGroupLoading")(js.Any.fromFunction1(isGroupLoading))
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.get.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (onGroupHeaderClick != null) __obj.updateDynamic("onGroupHeaderClick")(js.Any.fromFunction1(onGroupHeaderClick))
    if (onRenderGroupHeaderCheckbox != null) __obj.updateDynamic("onRenderGroupHeaderCheckbox")(js.Any.fromFunction2(onRenderGroupHeaderCheckbox))
    if (onRenderTitle != null) __obj.updateDynamic("onRenderTitle")(js.Any.fromFunction2(onRenderTitle))
    if (onToggleCollapse != null) __obj.updateDynamic("onToggleCollapse")(js.Any.fromFunction1(onToggleCollapse))
    if (onToggleSelectGroup != null) __obj.updateDynamic("onToggleSelectGroup")(js.Any.fromFunction1(onToggleSelectGroup))
    if (onToggleSummarize != null) __obj.updateDynamic("onToggleSummarize")(js.Any.fromFunction1(onToggleSummarize))
    if (selectAllButtonProps != null) __obj.updateDynamic("selectAllButtonProps")(selectAllButtonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.get.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showAllLinkText != null) __obj.updateDynamic("showAllLinkText")(showAllLinkText.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useFastIcons)) __obj.updateDynamic("useFastIcons")(useFastIcons.get.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupHeaderProps]
  }
}

