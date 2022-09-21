package typings.muiDatatables.mod

import typings.muiDatatables.anon.Data
import typings.muiDatatables.mod.^
import typings.muiDatatables.muiDatatablesStrings.disabled
import typings.muiDatatables.muiDatatablesStrings.excluded
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default: ComponentType[MUIDataTableProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("default").asInstanceOf[ComponentType[MUIDataTableProps]]

inline def DebounceTableSearch: ComponentType[DebouncedMUIDataTableSearch] = ^.asInstanceOf[js.Dynamic].selectDynamic("DebounceTableSearch").asInstanceOf[ComponentType[DebouncedMUIDataTableSearch]]

inline def ExpandButton: ComponentType[MUIDataTableExpandButton] = ^.asInstanceOf[js.Dynamic].selectDynamic("ExpandButton").asInstanceOf[ComponentType[MUIDataTableExpandButton]]

inline def MUIDataTable: ComponentType[MUIDataTableProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("MUIDataTable").asInstanceOf[ComponentType[MUIDataTableProps]]

inline def Popover: ComponentType[MUIDataTablePopover] = ^.asInstanceOf[js.Dynamic].selectDynamic("Popover").asInstanceOf[ComponentType[MUIDataTablePopover]]

inline def TableBody: ComponentType[MUIDataTableBody] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableBody").asInstanceOf[ComponentType[MUIDataTableBody]]

inline def TableBodyCell: ComponentType[MUIDataTableBodyCell] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableBodyCell").asInstanceOf[ComponentType[MUIDataTableBodyCell]]

inline def TableBodyRow: ComponentType[MUIDataTableBodyRow] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableBodyRow").asInstanceOf[ComponentType[MUIDataTableBodyRow]]

inline def TableFilter: ComponentType[MUIDataTableFilter] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableFilter").asInstanceOf[ComponentType[MUIDataTableFilter]]

inline def TableFilterList: ComponentType[MUIDataTableFilterList] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableFilterList").asInstanceOf[ComponentType[MUIDataTableFilterList]]

inline def TableFooter: ComponentType[MUIDataTableFooter] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableFooter").asInstanceOf[ComponentType[MUIDataTableFooter]]

inline def TableHead: ComponentType[MUIDataTableHead] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableHead").asInstanceOf[ComponentType[MUIDataTableHead]]

inline def TableHeadCell: ComponentType[MUIDataTableHeadCell] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableHeadCell").asInstanceOf[ComponentType[MUIDataTableHeadCell]]

inline def TableHeadRow: ComponentType[MUIDataTableHeadRow] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableHeadRow").asInstanceOf[ComponentType[MUIDataTableHeadRow]]

inline def TablePagination: ComponentType[MUIDataTablePagination] = ^.asInstanceOf[js.Dynamic].selectDynamic("TablePagination").asInstanceOf[ComponentType[MUIDataTablePagination]]

inline def TableResize: ComponentType[MUIDataTableResize] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableResize").asInstanceOf[ComponentType[MUIDataTableResize]]

inline def TableSearch: ComponentType[MUIDataTableSearch] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableSearch").asInstanceOf[ComponentType[MUIDataTableSearch]]

inline def TableSelectCell: ComponentType[MUIDataTableSelectCell] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableSelectCell").asInstanceOf[ComponentType[MUIDataTableSelectCell]]

inline def TableToolbar: ComponentType[MUIDataTableToolbar] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableToolbar").asInstanceOf[ComponentType[MUIDataTableToolbar]]

inline def TableToolbarSelect: ComponentType[MUIDataTableToolbarSelect] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableToolbarSelect").asInstanceOf[ComponentType[MUIDataTableToolbarSelect]]

inline def TableViewCol: ComponentType[MUIDataTableViewCol] = ^.asInstanceOf[js.Dynamic].selectDynamic("TableViewCol").asInstanceOf[ComponentType[MUIDataTableViewCol]]

inline def debounceSearchRender(): js.UndefOr[
js.Function4[
  /* searchText */ String, 
  /* handleSearch */ js.Function1[/* text */ String, Unit], 
  /* hideSearch */ js.Function0[Unit], 
  /* options */ Any, 
  (Component[js.Object, js.Object, Any]) | Element
]] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounceSearchRender")().asInstanceOf[js.UndefOr[
js.Function4[
  /* searchText */ String, 
  /* handleSearch */ js.Function1[/* text */ String, Unit], 
  /* hideSearch */ js.Function0[Unit], 
  /* options */ Any, 
  (Component[js.Object, js.Object, Any]) | Element
]]]
inline def debounceSearchRender(debounceWait: Double): js.UndefOr[
js.Function4[
  /* searchText */ String, 
  /* handleSearch */ js.Function1[/* text */ String, Unit], 
  /* hideSearch */ js.Function0[Unit], 
  /* options */ Any, 
  (Component[js.Object, js.Object, Any]) | Element
]] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounceSearchRender")(debounceWait.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
js.Function4[
  /* searchText */ String, 
  /* handleSearch */ js.Function1[/* text */ String, Unit], 
  /* hideSearch */ js.Function0[Unit], 
  /* options */ Any, 
  (Component[js.Object, js.Object, Any]) | Element
]]]

type Display = Boolean | excluded

type DisplayData = js.Array[Data]

type MUIDataTableColumnDef = String | MUIDataTableColumn

type RenderCustomComponent[P] = js.Function1[/* props */ P, ReactNode]

type ToolbarButton = Boolean | disabled
