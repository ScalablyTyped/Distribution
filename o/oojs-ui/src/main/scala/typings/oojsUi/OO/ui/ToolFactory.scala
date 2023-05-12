package typings.oojsUi.OO.ui

import typings.oojs.OO.Factory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ToolGroupFactories create {@link OO.ui.ToolGroup toolgroups} on demand. The toolgroup classes
  * must specify a symbolic name and be registered with the factory. The following classes are
  * registered by default:
  *
  * - {@link OO.ui.BarToolGroup BarToolGroups} (‘bar’)
  * - {@link OO.ui.MenuToolGroup MenuToolGroups} (‘menu’)
  * - {@link OO.ui.ListToolGroup ListToolGroups} (‘list’)
  *
  * See {@link OO.ui.Toolbar toolbars} for an example.
  *
  * For more information about toolbars in general, please see the
  * [OOUI documentation on MediaWiki](https://www.mediawiki.org/wiki/OOUI/Toolbars).
  *
  * ResourceLoader module: `oojs-ui-toolbars`
  *
  * @see https://doc.wikimedia.org/oojs-ui/master/js/#!/api/OO.ui.ToolFactory
  */
@js.native
trait ToolFactory
  extends StObject
     with Factory {
  
  /**
    * Get tools from the factory.
    *
    * @param include Included tools, see extract for format
    * @param exclude Excluded tools, see extract for format
    * @param promote Promoted tools, see extract for format
    * @param demote Demoted tools, see extract for format
    * @return List of tools
    */
  def getTools(
    include: js.Array[ToolExtractionCollection],
    exclude: js.Array[ToolExtractionCollection],
    promote: js.Array[ToolExtractionCollection],
    demote: js.Array[ToolExtractionCollection]
  ): js.Array[String] = js.native
  def getTools(
    include: js.Array[ToolExtractionCollection],
    exclude: js.Array[ToolExtractionCollection],
    promote: js.Array[ToolExtractionCollection],
    demote: ToolExtractionCollection
  ): js.Array[String] = js.native
  def getTools(
    include: js.Array[ToolExtractionCollection],
    exclude: js.Array[ToolExtractionCollection],
    promote: ToolExtractionCollection,
    demote: js.Array[ToolExtractionCollection]
  ): js.Array[String] = js.native
  def getTools(
    include: js.Array[ToolExtractionCollection],
    exclude: js.Array[ToolExtractionCollection],
    promote: ToolExtractionCollection,
    demote: ToolExtractionCollection
  ): js.Array[String] = js.native
  def getTools(
    include: js.Array[ToolExtractionCollection],
    exclude: ToolExtractionCollection,
    promote: js.Array[ToolExtractionCollection],
    demote: js.Array[ToolExtractionCollection]
  ): js.Array[String] = js.native
  def getTools(
    include: js.Array[ToolExtractionCollection],
    exclude: ToolExtractionCollection,
    promote: js.Array[ToolExtractionCollection],
    demote: ToolExtractionCollection
  ): js.Array[String] = js.native
  def getTools(
    include: js.Array[ToolExtractionCollection],
    exclude: ToolExtractionCollection,
    promote: ToolExtractionCollection,
    demote: js.Array[ToolExtractionCollection]
  ): js.Array[String] = js.native
  def getTools(
    include: js.Array[ToolExtractionCollection],
    exclude: ToolExtractionCollection,
    promote: ToolExtractionCollection,
    demote: ToolExtractionCollection
  ): js.Array[String] = js.native
  def getTools(
    include: ToolExtractionCollection,
    exclude: js.Array[ToolExtractionCollection],
    promote: js.Array[ToolExtractionCollection],
    demote: js.Array[ToolExtractionCollection]
  ): js.Array[String] = js.native
  def getTools(
    include: ToolExtractionCollection,
    exclude: js.Array[ToolExtractionCollection],
    promote: js.Array[ToolExtractionCollection],
    demote: ToolExtractionCollection
  ): js.Array[String] = js.native
  def getTools(
    include: ToolExtractionCollection,
    exclude: js.Array[ToolExtractionCollection],
    promote: ToolExtractionCollection,
    demote: js.Array[ToolExtractionCollection]
  ): js.Array[String] = js.native
  def getTools(
    include: ToolExtractionCollection,
    exclude: js.Array[ToolExtractionCollection],
    promote: ToolExtractionCollection,
    demote: ToolExtractionCollection
  ): js.Array[String] = js.native
  def getTools(
    include: ToolExtractionCollection,
    exclude: ToolExtractionCollection,
    promote: js.Array[ToolExtractionCollection],
    demote: js.Array[ToolExtractionCollection]
  ): js.Array[String] = js.native
  def getTools(
    include: ToolExtractionCollection,
    exclude: ToolExtractionCollection,
    promote: js.Array[ToolExtractionCollection],
    demote: ToolExtractionCollection
  ): js.Array[String] = js.native
  def getTools(
    include: ToolExtractionCollection,
    exclude: ToolExtractionCollection,
    promote: ToolExtractionCollection,
    demote: js.Array[ToolExtractionCollection]
  ): js.Array[String] = js.native
  def getTools(
    include: ToolExtractionCollection,
    exclude: ToolExtractionCollection,
    promote: ToolExtractionCollection,
    demote: ToolExtractionCollection
  ): js.Array[String] = js.native
}
