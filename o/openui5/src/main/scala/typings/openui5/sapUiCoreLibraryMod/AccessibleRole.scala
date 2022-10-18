package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AccessibleRole extends StObject
@JSImport("sap/ui/core/library", "AccessibleRole")
@js.native
object AccessibleRole extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AccessibleRole & String] = js.native
  
  /**
    * A message with an alert or error information.
    */
  @js.native
  sealed trait Alert
    extends StObject
       with AccessibleRole
  /* "Alert" */ val Alert: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Alert & String = js.native
  
  /**
    * A separate window with an alert or error information.
    */
  @js.native
  sealed trait AlertDialog
    extends StObject
       with AccessibleRole
  /* "AlertDialog" */ val AlertDialog: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.AlertDialog & String = js.native
  
  /**
    * A software unit executing a set of tasks for the user.
    */
  @js.native
  sealed trait Application
    extends StObject
       with AccessibleRole
  /* "Application" */ val Application: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Application & String = js.native
  
  /**
    * Usually defined as the advertisement at the top of a web page. The banner content typically contains
    * the site or company logo, or other key advertisements.
    */
  @js.native
  sealed trait Banner
    extends StObject
       with AccessibleRole
  /* "Banner" */ val Banner: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Banner & String = js.native
  
  /**
    * Allows user-triggered actions.
    */
  @js.native
  sealed trait Button
    extends StObject
       with AccessibleRole
  /* "Button" */ val Button: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Button & String = js.native
  
  /**
    * A control that has three possible values: true, false, mixed.
    */
  @js.native
  sealed trait Checkbox
    extends StObject
       with AccessibleRole
  /* "Checkbox" */ val Checkbox: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Checkbox & String = js.native
  
  /**
    * A table cell containing header information for a column.
    */
  @js.native
  sealed trait ColumnHeader
    extends StObject
       with AccessibleRole
  /* "ColumnHeader" */ val ColumnHeader: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.ColumnHeader & String = js.native
  
  /**
    * Allows selecting an item from a list, or to enter data directly in the input field.
    */
  @js.native
  sealed trait Combobox
    extends StObject
       with AccessibleRole
  /* "Combobox" */ val Combobox: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Combobox & String = js.native
  
  /**
    * Information about the content on the page. Examples are footnotes, copyrights, or links to privacy statements.
    */
  @js.native
  sealed trait ContentInfo
    extends StObject
       with AccessibleRole
  /* "ContentInfo" */ val ContentInfo: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.ContentInfo & String = js.native
  
  /**
    * The content of the associated element represents a definition. If there is a definition element within
    * the content, this one represents the term being defined.
    */
  @js.native
  sealed trait Definition
    extends StObject
       with AccessibleRole
  /* "Definition" */ val Definition: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Definition & String = js.native
  
  /**
    * Descriptive content for a page element.
    */
  @js.native
  sealed trait Description
    extends StObject
       with AccessibleRole
  /* "Description" */ val Description: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Description & String = js.native
  
  /**
    * A small window that is designed to interrupt the current application processing in order to inform the
    * user and to get some response.
    */
  @js.native
  sealed trait Dialog
    extends StObject
       with AccessibleRole
  /* "Dialog" */ val Dialog: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Dialog & String = js.native
  
  /**
    * A list of references to members of a single group.
    */
  @js.native
  sealed trait Directory
    extends StObject
       with AccessibleRole
  /* "Directory" */ val Directory: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Directory & String = js.native
  
  /**
    * Content that contains related information, such as a book.
    */
  @js.native
  sealed trait Document
    extends StObject
       with AccessibleRole
  /* "Document" */ val Document: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Document & String = js.native
  
  /**
    * Contains cells of tabular data arranged in rows and columns, for example in a table.
    */
  @js.native
  sealed trait Grid
    extends StObject
       with AccessibleRole
  /* "Grid" */ val Grid: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Grid & String = js.native
  
  /**
    * A table cell in a grid where the cells can be active, editable, and selectable. Cells may have functional
    * relationships to controls, for example.
    */
  @js.native
  sealed trait GridCell
    extends StObject
       with AccessibleRole
  /* "GridCell" */ val GridCell: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.GridCell & String = js.native
  
  /**
    * A section of user interface objects.
    */
  @js.native
  sealed trait Group
    extends StObject
       with AccessibleRole
  /* "Group" */ val Group: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Group & String = js.native
  
  /**
    * A heading for a section of the page.
    */
  @js.native
  sealed trait Heading
    extends StObject
       with AccessibleRole
  /* "Heading" */ val Heading: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Heading & String = js.native
  
  /**
    * A container for a collection of elements that form an image.
    */
  @js.native
  sealed trait Img
    extends StObject
       with AccessibleRole
  /* "Img" */ val Img: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Img & String = js.native
  
  /**
    * An interactive reference to a resource.
    */
  @js.native
  sealed trait Link
    extends StObject
       with AccessibleRole
  /* "Link" */ val Link: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Link & String = js.native
  
  /**
    * A container for non-interactive list items which are the children of the list.
    */
  @js.native
  sealed trait List
    extends StObject
       with AccessibleRole
  /* "List" */ val List: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.List & String = js.native
  
  /**
    * A single item in a list.
    */
  @js.native
  sealed trait ListItem
    extends StObject
       with AccessibleRole
  /* "ListItem" */ val ListItem: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.ListItem & String = js.native
  
  /**
    * A widget that allows the user to select one or more items from a list. The items within the list are
    * static and can contain images.
    */
  @js.native
  sealed trait Listbox
    extends StObject
       with AccessibleRole
  /* "Listbox" */ val Listbox: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Listbox & String = js.native
  
  /**
    * An area where new information is added, or old information disappears. Information types are chat logs,
    * messaging, or error logs, for example. The log contains a sequence: New information is always added to
    * the end of the log.
    */
  @js.native
  sealed trait Log
    extends StObject
       with AccessibleRole
  /* "Log" */ val Log: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Log & String = js.native
  
  /**
    * Defines the main content of a document.
    */
  @js.native
  sealed trait Main
    extends StObject
       with AccessibleRole
  /* "Main" */ val Main: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Main & String = js.native
  
  /**
    * Is used to scroll text across the page.
    */
  @js.native
  sealed trait Marquee
    extends StObject
       with AccessibleRole
  /* "Marquee" */ val Marquee: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Marquee & String = js.native
  
  /**
    * Offers a list of choices to the user.
    */
  @js.native
  sealed trait Menu
    extends StObject
       with AccessibleRole
  /* "Menu" */ val Menu: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Menu & String = js.native
  
  /**
    * A child in a menu.
    */
  @js.native
  sealed trait MenuItem
    extends StObject
       with AccessibleRole
  /* "MenuItem" */ val MenuItem: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.MenuItem & String = js.native
  
  /**
    * A checkable menu item (tri-state).
    */
  @js.native
  sealed trait MenuItemCheckbox
    extends StObject
       with AccessibleRole
  /* "MenuItemCheckbox" */ val MenuItemCheckbox: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.MenuItemCheckbox & String = js.native
  
  /**
    * A menu item which is part of a group of menuitemradio roles.
    */
  @js.native
  sealed trait MenuItemRadio
    extends StObject
       with AccessibleRole
  /* "MenuItemRadio" */ val MenuItemRadio: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.MenuItemRadio & String = js.native
  
  /**
    * A container for menu items where each item may activate a submenu.
    */
  @js.native
  sealed trait Menubar
    extends StObject
       with AccessibleRole
  /* "Menubar" */ val Menubar: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Menubar & String = js.native
  
  /**
    * A collection of links suitable for use when navigating the document or related documents.
    */
  @js.native
  sealed trait Navigation
    extends StObject
       with AccessibleRole
  /* "Navigation" */ val Navigation: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Navigation & String = js.native
  
  /**
    * The content is parenthetic or ancillary to the main content of the resource.
    */
  @js.native
  sealed trait Note
    extends StObject
       with AccessibleRole
  /* "Note" */ val Note: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Note & String = js.native
  
  /**
    * A selectable item in a list represented by a select.
    */
  @js.native
  sealed trait Option
    extends StObject
       with AccessibleRole
  /* "Option" */ val Option: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Option & String = js.native
  
  /**
    * An element whose role is presentational does not need to be mapped to the accessibility API.
    */
  @js.native
  sealed trait Presentation
    extends StObject
       with AccessibleRole
  /* "Presentation" */ val Presentation: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Presentation & String = js.native
  
  /**
    * Shows the execution progress in applications providing functions that take a long time.
    */
  @js.native
  sealed trait ProgressBar
    extends StObject
       with AccessibleRole
  /* "ProgressBar" */ val ProgressBar: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.ProgressBar & String = js.native
  
  /**
    * An option in single-select list. Only one radio control in a radiogroup can be selected at the same time.
    */
  @js.native
  sealed trait Radio
    extends StObject
       with AccessibleRole
  /* "Radio" */ val Radio: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Radio & String = js.native
  
  /**
    * A group of radio controls.
    */
  @js.native
  sealed trait RadioGroup
    extends StObject
       with AccessibleRole
  /* "RadioGroup" */ val RadioGroup: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.RadioGroup & String = js.native
  
  /**
    * A large section on the web page.
    */
  @js.native
  sealed trait Region
    extends StObject
       with AccessibleRole
  /* "Region" */ val Region: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Region & String = js.native
  
  /**
    * A row of table cells.
    */
  @js.native
  sealed trait Row
    extends StObject
       with AccessibleRole
  /* "Row" */ val Row: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Row & String = js.native
  
  /**
    * A table cell containing header information for a row.
    */
  @js.native
  sealed trait RowHeader
    extends StObject
       with AccessibleRole
  /* "RowHeader" */ val RowHeader: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.RowHeader & String = js.native
  
  /**
    * A search section of a web document. In many cases, this is a form used to submit search requests about
    * the site, or a more general Internet wide search service.
    */
  @js.native
  sealed trait Search
    extends StObject
       with AccessibleRole
  /* "Search" */ val Search: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Search & String = js.native
  
  /**
    * A unique section of the document. In the case of a portal, this may include time display, weather forecast,
    * or stock price.
    */
  @js.native
  sealed trait Secondary
    extends StObject
       with AccessibleRole
  /* "Secondary" */ val Secondary: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Secondary & String = js.native
  
  /**
    * Indicates that the element contains content that is related to the main content of the page.
    */
  @js.native
  sealed trait SeeAlso
    extends StObject
       with AccessibleRole
  /* "SeeAlso" */ val SeeAlso: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.SeeAlso & String = js.native
  
  /**
    * A line or bar that separates sections of content.
    */
  @js.native
  sealed trait Separator
    extends StObject
       with AccessibleRole
  /* "Separator" */ val Separator: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Separator & String = js.native
  
  /**
    * A user input where the user selects an input in a given range. This form of range expects an analogous
    * keyboard interface.
    */
  @js.native
  sealed trait Slider
    extends StObject
       with AccessibleRole
  /* "Slider" */ val Slider: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Slider & String = js.native
  
  /**
    * Allows users to select a value from a list of given entries where exactly one value is displayed at runtime,
    * and the other ones can be displayed by scrolling using the arrow up and arrow down key.
    */
  @js.native
  sealed trait SpinButton
    extends StObject
       with AccessibleRole
  /* "SpinButton" */ val SpinButton: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.SpinButton & String = js.native
  
  /**
    * A container for processing advisory information.
    */
  @js.native
  sealed trait Status
    extends StObject
       with AccessibleRole
  /* "Status" */ val Status: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Status & String = js.native
  
  /**
    * A header for a tab panel.
    */
  @js.native
  sealed trait Tab
    extends StObject
       with AccessibleRole
  /* "Tab" */ val Tab: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Tab & String = js.native
  
  /**
    * A list of tabs which are references to tab panels.
    */
  @js.native
  sealed trait Tablist
    extends StObject
       with AccessibleRole
  /* "Tablist" */ val Tablist: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Tablist & String = js.native
  
  /**
    * A container for the resources associated with a tab.
    */
  @js.native
  sealed trait Tabpanel
    extends StObject
       with AccessibleRole
  /* "Tabpanel" */ val Tabpanel: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Tabpanel & String = js.native
  
  /**
    * Inputs that allow free-form text as their value.
    */
  @js.native
  sealed trait Textbox
    extends StObject
       with AccessibleRole
  /* "Textbox" */ val Textbox: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Textbox & String = js.native
  
  /**
    * A numerical counter which indicates an amount of elapsed time from a start point, or of the time remaining
    * until a certain end point.
    */
  @js.native
  sealed trait Timer
    extends StObject
       with AccessibleRole
  /* "Timer" */ val Timer: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Timer & String = js.native
  
  /**
    * A collection of commonly used functions represented in compact visual form.
    */
  @js.native
  sealed trait Toolbar
    extends StObject
       with AccessibleRole
  /* "Toolbar" */ val Toolbar: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Toolbar & String = js.native
  
  /**
    * A popup that displays a description for an element when the user passes over or rests on that element.
    * Supplement to the normal tooltip processing of the user agent.
    */
  @js.native
  sealed trait Tooltip
    extends StObject
       with AccessibleRole
  /* "Tooltip" */ val Tooltip: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Tooltip & String = js.native
  
  /**
    * A form of a list (tree) having groups (subtrees) inside groups (subtrees), where the sub trees can be
    * collapsed and expanded.
    */
  @js.native
  sealed trait Tree
    extends StObject
       with AccessibleRole
  /* "Tree" */ val Tree: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.Tree & String = js.native
  
  /**
    * A grid whose rows are expandable and collapsable in the same manner as the ones of trees.
    */
  @js.native
  sealed trait TreeGrid
    extends StObject
       with AccessibleRole
  /* "TreeGrid" */ val TreeGrid: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.TreeGrid & String = js.native
  
  /**
    * A tree node
    */
  @js.native
  sealed trait TreeItem
    extends StObject
       with AccessibleRole
  /* "TreeItem" */ val TreeItem: typings.openui5.sapUiCoreLibraryMod.AccessibleRole.TreeItem & String = js.native
}
