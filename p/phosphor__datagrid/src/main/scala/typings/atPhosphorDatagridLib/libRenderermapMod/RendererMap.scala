package typings
package atPhosphorDatagridLib.libRenderermapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/datagrid/lib/renderermap", "RendererMap")
@js.native
/**
  * Construct a new renderer map.
  *
  * @param options - The options for initializing the map.
  */
class RendererMap () extends js.Object {
  def this(options: atPhosphorDatagridLib.libRenderermapMod.RendererMapNs.IOptions) = this()
  var _changed: js.Any = js.native
  var _entries: js.Any = js.native
  var _ranks: js.Any = js.native
  var _renderers: js.Any = js.native
  /**
    * A signal emitted when the map contents are changed.
    */
  val changed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * Remove all custom cell renderers from the map.
    */
  def clear(): scala.Unit = js.native
  /**
    * Get the cell renderer to use for the given region and metadata.
    *
    * @param region - The cell region of interest.
    *
    * @param metadata - The data model metadata for the region.
    *
    * @returns The best matching cell renderer, or `undefined`.
    *
    * #### Notes
    * Non-string metadata values are ignored.
    */
  def get(
    region: atPhosphorDatagridLib.libDatamodelMod.DataModelNs.CellRegion,
    metadata: atPhosphorDatagridLib.libDatamodelMod.DataModelNs.Metadata
  ): js.UndefOr[atPhosphorDatagridLib.libCellrendererMod.CellRenderer] = js.native
  /**
    * Set the cell renderer for a particular region and metadata.
    *
    * @param region - The cell region of interest.
    *
    * @param metadata - The metadata to match against the model.
    *
    * @param renderer - The cell renderer to set in the map.
    *
    * #### Notes
    * The keys and values in the supplied metadata are matched against
    * the metadata supplied by the data model. The given metadata must
    * be an exact matching subset of the model metadata in order for
    * there to be a match.
    *
    * Matches are ranked according the number of matched values, with
    * ties broken based on the priorty order given to the constructor.
    *
    * Non-string metadata values are ignored.
    */
  def set(
    region: atPhosphorDatagridLib.libDatamodelMod.DataModelNs.CellRegion,
    metadata: atPhosphorDatagridLib.libDatamodelMod.DataModelNs.Metadata,
    renderer: atPhosphorDatagridLib.libCellrendererMod.CellRenderer
  ): scala.Unit = js.native
}

