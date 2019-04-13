package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultMap extends js.Object {
  /**
    * Add a single mapping from original source line and column to the generated
    * source's line and column for this source map being created. The mapping
    * object should have the following properties:
    * @param mapping
    * @returns {}
    */
  def addMapping(mapping: sourceDashMapLib.sourceDashMapMod.Mapping): scala.Unit = js.native
  /**
    * Applies a SourceMap for a source file to the SourceMap. Each mapping to
    * the supplied source file is rewritten using the supplied SourceMap.
    * Note: The resolution for the resulting mappings is the minimium of this
    * map and the supplied map.
    * @param sourceMapConsumer The SourceMap to be applied.
    * @param sourceFile The filename of the source file. If omitted, sourceMapConsumer
    * file will be used, if it exists. Otherwise an error will be thrown.
    * @param sourceMapPath The dirname of the path to the SourceMap to be applied.
    * If relative, it is relative to the SourceMap. This parameter is needed when
    * the two SourceMaps aren't in the same directory, and the SourceMap to be
    * applied contains relative source paths. If so, those relative source paths
    * need to be rewritten relative to the SourceMap.
    * If omitted, it is assumed that both SourceMaps are in the same directory;
    * thus, not needing any rewriting (Supplying '.' has the same effect).
    */
  def applySourceMap(sourceMapConsumer: sourceDashMapLib.sourceDashMapMod.SourceMapConsumer): scala.Unit = js.native
  def applySourceMap(
    sourceMapConsumer: sourceDashMapLib.sourceDashMapMod.SourceMapConsumer,
    sourceFile: java.lang.String
  ): scala.Unit = js.native
  def applySourceMap(
    sourceMapConsumer: sourceDashMapLib.sourceDashMapMod.SourceMapConsumer,
    sourceFile: java.lang.String,
    sourceMapPath: java.lang.String
  ): scala.Unit = js.native
  /**
    * Set the source content for an original source file.
    * @param sourceFile The URL of the original source file.
    * @param sourceContent The content of the source file.
    */
  def setSourceContent(sourceFile: java.lang.String, sourceContent: java.lang.String): scala.Unit = js.native
  /**
    * Renders the source map being generated to JSON.
    */
  def toJSON(): sourceDashMapLib.sourceDashMapMod.RawSourceMap = js.native
}

