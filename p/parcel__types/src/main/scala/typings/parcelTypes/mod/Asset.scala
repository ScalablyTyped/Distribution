package typings.parcelTypes.mod

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.parcelFs.typesMod.FileSystem
import typings.parcelSourceMap.mod.default
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asset
  extends StObject
     with BaseAsset {
  
  /** Statistics about the asset. */
  val stats: Stats
}
object Asset {
  
  inline def apply(
    env: Environment,
    filePath: FilePath,
    fs: FileSystem,
    getAST: () => js.Promise[js.UndefOr[AST | Null]],
    getBuffer: () => js.Promise[Buffer],
    getCode: () => js.Promise[String],
    getDependencies: () => js.Array[Dependency],
    getMap: () => js.Promise[js.UndefOr[default | Null]],
    getMapBuffer: () => js.Promise[js.UndefOr[Buffer | Null]],
    getStream: () => Readable,
    id: String,
    isBundleSplittable: Boolean,
    isSource: Boolean,
    meta: Meta,
    query: URLSearchParams,
    sideEffects: Boolean,
    stats: Stats,
    symbols: AssetSymbols,
    `type`: String
  ): Asset = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], getAST = js.Any.fromFunction0(getAST), getBuffer = js.Any.fromFunction0(getBuffer), getCode = js.Any.fromFunction0(getCode), getDependencies = js.Any.fromFunction0(getDependencies), getMap = js.Any.fromFunction0(getMap), getMapBuffer = js.Any.fromFunction0(getMapBuffer), getStream = js.Any.fromFunction0(getStream), id = id.asInstanceOf[js.Any], isBundleSplittable = isBundleSplittable.asInstanceOf[js.Any], isSource = isSource.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], sideEffects = sideEffects.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asset]
  }
  
  extension [Self <: Asset](x: Self) {
    
    inline def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
