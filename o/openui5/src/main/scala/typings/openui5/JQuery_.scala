package typings.openui5

import typings.openui5.sapUiCoreControlMod.default
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery_[TElement]
  extends StObject
     with Iterable[TElement] {
  
  /**
    * Adds the given ID reference to the aria-describedby attribute.
    */
  def addAriaDescribedBy(/**
    * The ID reference of an element
    */
  sId: String): jQuery[HTMLElement] = js.native
  def addAriaDescribedBy(
    /**
    * The ID reference of an element
    */
  sId: String,
    /**
    * whether prepend or not
    */
  bPrepend: Boolean
  ): jQuery[HTMLElement] = js.native
  
  /**
    * Adds the given ID reference to the aria-labelledby attribute.
    */
  def addAriaLabelledBy(/**
    * The ID reference of an element
    */
  sId: String): jQuery[HTMLElement] = js.native
  def addAriaLabelledBy(
    /**
    * The ID reference of an element
    */
  sId: String,
    /**
    * Whether prepend or not
    */
  bPrepend: Boolean
  ): jQuery[HTMLElement] = js.native
  
  /**
    * Extension function to the jQuery.fn which identifies SAPUI5 controls in the given jQuery context.
    */
  def control(): js.Array[default] = js.native
  def control(
    /**
    * Whether or not to respect the associated DOM elements to a control via <code>data-sap-ui-related</code> attribute.
    */
  includeRelated: Boolean
  ): js.Array[default] = js.native
  /**
    * Extension function to the jQuery.fn which identifies SAPUI5 controls in the given jQuery context.
    */
  def control(/**
    * Parameter to return the control instance at the given index in the array.
    */
  index: int): default | Null = js.native
  def control(
    /**
    * Parameter to return the control instance at the given index in the array.
    */
  index: int,
    /**
    * Whether or not to respect the associated DOM elements to a control via <code>data-sap-ui-related</code> attribute.
    */
  includeRelated: Boolean
  ): default | Null = js.native
  
  /**
    * Gets the position of the cursor in an element that supports cursor positioning.
    */
  def cursorPos(): int = js.native
  /**
    * Sets the position of the cursor in an element that supports cursor positioning.
    */
  def cursorPos(/**
    * The cursor position to set
    */
  iPos: int): jQuery[HTMLElement] = js.native
  
  /**
    * Disable HTML elements selection.
    */
  def disableSelection(): jQuery[HTMLElement] = js.native
  
  /**
    * Enable HTML elements to get selected.
    */
  def enableSelection(): jQuery[HTMLElement] = js.native
  
  /**
    * Returns the first focusable domRef in a given container (the first element of the collection)
    */
  def firstFocusableDomRef(): Element = js.native
  
  /**
    * Retrieve the selected text in the first element of the collection.
    *
    * <b>Note</b>: This feature is only supported for input element’s type of text, search, url, tel and password.
    */
  def getSelectedText(): String = js.native
  
  /**
    * Returns <code>true</code> if the first element has a set tabindex.
    */
  def hasTabIndex(): Boolean = js.native
  
  /**
    * Returns the last focusable domRef in a given container
    */
  def lastFocusableDomRef(): Element = js.native
  
  /**
    * Gets the next parent DOM element with a given attribute and attribute value starting above the first given element
    */
  def parentByAttribute(
    /**
    * Name of the attribute
    */
  sAttribute: String,
    /**
    * Value of the attribute (optional)
    */
  sValue: String
  ): Element = js.native
  
  /**
    * Returns a rectangle describing the current visual positioning of the first DOM object in the collection
    * (or <code>null</code> if no element was given).
    */
  def rect(): js.Object = js.native
  
  /**
    * Returns whether a point described by X and Y is inside this Rectangle's boundaries.
    */
  def rectContains(/**
    * The X coordinate
    */
  posX: int, /**
    * The Y coordinate
    */
  posY: int): Boolean = js.native
  
  /**
    * Removes the given ID reference from the aria-describedby attribute.
    */
  def removeAriaDescribedBy(/**
    * The ID reference of an element
    */
  sId: String): jQuery[HTMLElement] = js.native
  
  /**
    * Removes the given ID reference from the aria-labelledby attribute.
    */
  def removeAriaLabelledBy(/**
    * The ID reference of an element
    */
  sId: String): jQuery[HTMLElement] = js.native
  
  /**
    * Returns the scrollLeft value of the first element in the given jQuery collection in right-to-left mode.
    *
    * Precondition: The element is rendered in RTL mode.
    *
    * Reason for this method is that the major browsers use three different values for the same scroll position
    * when in RTL mode. This method hides those differences and returns/applies the same value that would be
    * returned in LTR mode: The distance in px how far the given container is scrolled away from the leftmost
    * scroll position.
    *
    * Returns "undefined" if no element is given.
    */
  def scrollLeftRTL(): js.UndefOr[int] = js.native
  /**
    * Sets the scrollLeft value of the first element in the given jQuery collection in right-to-left mode.
    *
    * Precondition: The element is rendered in RTL mode.
    *
    * Reason for this method is that the major browsers use three different values for the same scroll position
    * when in RTL mode. This method hides those differences and returns/applies the same value that would be
    * returned in LTR mode: The distance in px how far the given container is scrolled away from the leftmost
    * scroll position.
    */
  def scrollLeftRTL(/**
    * The desired scroll position
    */
  iPos: int): jQuery[HTMLElement] = js.native
  
  /**
    * Returns the MIRRORED scrollLeft value of the first element in the given jQuery collection in right-to-left mode.
    *
    * Precondition: The element is rendered in RTL mode.
    *
    * Reason for this method is that the major browsers return three different values for the same scroll position
    * when in RTL mode. This method hides those differences and returns the value that would be returned in LTR mode
    * if the UI would be mirrored horizontally: The distance in px how far the given container is scrolled away
    * from the rightmost scroll position.
    *
    * Returns "undefined" if no element is in the given jQuery collection.
    */
  def scrollRightRTL(): js.UndefOr[int] = js.native
  
  /**
    * Sets the text selection in the first element of the collection.
    *
    * <b>Note</b>: This feature is only supported for input element's type of text, search, url, tel and password.
    */
  def selectText(
    /**
    * Start position of the selection (inclusive)
    */
  iStart: int,
    /**
    * End position of the selection (exclusive)
    */
  iEnd: int
  ): jQuery[HTMLElement] = js.native
  
  /**
    * Get the z-index for an element.
    */
  def zIndex(): Double = js.native
  /**
    * Set the z-index for an element.
    */
  def zIndex(/**
    * The z-index to set
    */
  zIndex: int): jQuery[HTMLElement] = js.native
}
