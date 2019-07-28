package typings.atPhosphorDatagrid

import typings.atPhosphorDatagrid.libDatagridMod.DataGridNs.HeaderVisibility
import typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.CellRegion
import typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.ColumnRegion
import typings.atPhosphorDatagrid.libDatamodelMod.DataModelNs.RowRegion
import typings.atPhosphorDatagrid.libTextrendererMod.TextRendererNs.HorizontalAlignment
import typings.atPhosphorDatagrid.libTextrendererMod.TextRendererNs.VerticalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atPhosphorDatagridStrings {
  @js.native
  sealed trait all extends HeaderVisibility
  
  @js.native
  sealed trait body
    extends CellRegion
       with ColumnRegion
       with RowRegion
  
  @js.native
  sealed trait bottom extends VerticalAlignment
  
  @js.native
  sealed trait `cells-changed` extends js.Object
  
  @js.native
  sealed trait center
    extends HorizontalAlignment
       with VerticalAlignment
  
  @js.native
  sealed trait column extends HeaderVisibility
  
  @js.native
  sealed trait `column-header`
    extends CellRegion
       with RowRegion
  
  @js.native
  sealed trait `columns-inserted` extends js.Object
  
  @js.native
  sealed trait `columns-moved` extends js.Object
  
  @js.native
  sealed trait `columns-removed` extends js.Object
  
  @js.native
  sealed trait `corner-header` extends CellRegion
  
  @js.native
  sealed trait down extends js.Object
  
  @js.native
  sealed trait left extends HorizontalAlignment
  
  @js.native
  sealed trait `model-reset` extends js.Object
  
  @js.native
  sealed trait none extends HeaderVisibility
  
  @js.native
  sealed trait right extends HorizontalAlignment
  
  @js.native
  sealed trait row extends HeaderVisibility
  
  @js.native
  sealed trait `row-header`
    extends CellRegion
       with ColumnRegion
  
  @js.native
  sealed trait `rows-inserted` extends js.Object
  
  @js.native
  sealed trait `rows-moved` extends js.Object
  
  @js.native
  sealed trait `rows-removed` extends js.Object
  
  @js.native
  sealed trait top extends VerticalAlignment
  
  @js.native
  sealed trait up extends js.Object
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def `cells-changed`: `cells-changed` = "cells-changed".asInstanceOf[`cells-changed`]
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  @scala.inline
  def `column-header`: `column-header` = "column-header".asInstanceOf[`column-header`]
  @scala.inline
  def `columns-inserted`: `columns-inserted` = "columns-inserted".asInstanceOf[`columns-inserted`]
  @scala.inline
  def `columns-moved`: `columns-moved` = "columns-moved".asInstanceOf[`columns-moved`]
  @scala.inline
  def `columns-removed`: `columns-removed` = "columns-removed".asInstanceOf[`columns-removed`]
  @scala.inline
  def `corner-header`: `corner-header` = "corner-header".asInstanceOf[`corner-header`]
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def `model-reset`: `model-reset` = "model-reset".asInstanceOf[`model-reset`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  @scala.inline
  def `row-header`: `row-header` = "row-header".asInstanceOf[`row-header`]
  @scala.inline
  def `rows-inserted`: `rows-inserted` = "rows-inserted".asInstanceOf[`rows-inserted`]
  @scala.inline
  def `rows-moved`: `rows-moved` = "rows-moved".asInstanceOf[`rows-moved`]
  @scala.inline
  def `rows-removed`: `rows-removed` = "rows-removed".asInstanceOf[`rows-removed`]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
}

