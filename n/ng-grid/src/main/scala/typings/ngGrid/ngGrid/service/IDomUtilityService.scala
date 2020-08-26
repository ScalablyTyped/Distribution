package typings.ngGrid.ngGrid.service

import typings.ngGrid.ngGrid.IColumn
import typings.ngGrid.ngGrid.IDimension
import typings.ngGrid.ngGrid.IGridInstance
import typings.ngGrid.ngGrid.IGridScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDomUtilityService extends js.Object {
  var LetterW: Double = js.native
  var ScrollH: Double = js.native
  var ScrollW: Double = js.native
  var eventStorage: js.Any = js.native
  var immediate: Double = js.native
  var numberOfGrids: Double = js.native
  def AssignGridContainers(
    $scope: IGridScope,
    rootel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any,
    grid: IGridInstance
  ): Unit = js.native
  def BuildStyles($scope: IGridScope, grid: IGridInstance, digest: Boolean): Unit = js.native
  def RebuildGrid($scope: IGridScope, grid: IGridInstance): Unit = js.native
  def UpdateGridLayout($scope: IGridScope, grid: IGridInstance): Unit = js.native
  def digest($scope: IGridScope): Unit = js.native
  def getRealWidth(obj: IDimension): Double = js.native
  def setColLeft(col: IColumn, colLeft: Double, grid: IGridInstance): Unit = js.native
  def setStyleText(grid: IGridInstance, css: String): Unit = js.native
}

object IDomUtilityService {
  @scala.inline
  def apply(
    AssignGridContainers: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, IGridInstance) => Unit,
    BuildStyles: (IGridScope, IGridInstance, Boolean) => Unit,
    LetterW: Double,
    RebuildGrid: (IGridScope, IGridInstance) => Unit,
    ScrollH: Double,
    ScrollW: Double,
    UpdateGridLayout: (IGridScope, IGridInstance) => Unit,
    digest: IGridScope => Unit,
    eventStorage: js.Any,
    getRealWidth: IDimension => Double,
    immediate: Double,
    numberOfGrids: Double,
    setColLeft: (IColumn, Double, IGridInstance) => Unit,
    setStyleText: (IGridInstance, String) => Unit
  ): IDomUtilityService = {
    val __obj = js.Dynamic.literal(AssignGridContainers = js.Any.fromFunction3(AssignGridContainers), BuildStyles = js.Any.fromFunction3(BuildStyles), LetterW = LetterW.asInstanceOf[js.Any], RebuildGrid = js.Any.fromFunction2(RebuildGrid), ScrollH = ScrollH.asInstanceOf[js.Any], ScrollW = ScrollW.asInstanceOf[js.Any], UpdateGridLayout = js.Any.fromFunction2(UpdateGridLayout), digest = js.Any.fromFunction1(digest), eventStorage = eventStorage.asInstanceOf[js.Any], getRealWidth = js.Any.fromFunction1(getRealWidth), immediate = immediate.asInstanceOf[js.Any], numberOfGrids = numberOfGrids.asInstanceOf[js.Any], setColLeft = js.Any.fromFunction3(setColLeft), setStyleText = js.Any.fromFunction2(setStyleText))
    __obj.asInstanceOf[IDomUtilityService]
  }
  @scala.inline
  implicit class IDomUtilityServiceOps[Self <: IDomUtilityService] (val x: Self) extends AnyVal {
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
    def setAssignGridContainers(
      value: (IGridScope, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IAugmentedJQuery */ js.Any, IGridInstance) => Unit
    ): Self = this.set("AssignGridContainers", js.Any.fromFunction3(value))
    @scala.inline
    def setBuildStyles(value: (IGridScope, IGridInstance, Boolean) => Unit): Self = this.set("BuildStyles", js.Any.fromFunction3(value))
    @scala.inline
    def setLetterW(value: Double): Self = this.set("LetterW", value.asInstanceOf[js.Any])
    @scala.inline
    def setRebuildGrid(value: (IGridScope, IGridInstance) => Unit): Self = this.set("RebuildGrid", js.Any.fromFunction2(value))
    @scala.inline
    def setScrollH(value: Double): Self = this.set("ScrollH", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollW(value: Double): Self = this.set("ScrollW", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateGridLayout(value: (IGridScope, IGridInstance) => Unit): Self = this.set("UpdateGridLayout", js.Any.fromFunction2(value))
    @scala.inline
    def setDigest(value: IGridScope => Unit): Self = this.set("digest", js.Any.fromFunction1(value))
    @scala.inline
    def setEventStorage(value: js.Any): Self = this.set("eventStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRealWidth(value: IDimension => Double): Self = this.set("getRealWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setImmediate(value: Double): Self = this.set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfGrids(value: Double): Self = this.set("numberOfGrids", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetColLeft(value: (IColumn, Double, IGridInstance) => Unit): Self = this.set("setColLeft", js.Any.fromFunction3(value))
    @scala.inline
    def setSetStyleText(value: (IGridInstance, String) => Unit): Self = this.set("setStyleText", js.Any.fromFunction2(value))
  }
  
}

