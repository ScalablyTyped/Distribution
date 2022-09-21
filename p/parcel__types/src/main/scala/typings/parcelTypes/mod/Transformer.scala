package typings.parcelTypes.mod

import typings.parcelTypes.anon.AssetAst
import typings.parcelTypes.anon.AssetsConfig
import typings.parcelTypes.anon.Ast
import typings.parcelTypes.anon.Options
import typings.parcelTypes.anon.Resolve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformer[ConfigType] extends StObject {
  
  /** Whether an AST from a previous transformer can be reused (to prevent double-parsing) */
  var canReuseAST: js.UndefOr[js.Function1[/* arg0 */ Ast, Boolean]] = js.undefined
  
  /** Stringify the AST */
  var generate: js.UndefOr[js.Function1[/* arg0 */ AssetAst, Async[GenerateOutput]]] = js.undefined
  
  var loadConfig: js.UndefOr[
    js.Function1[/* arg0 */ typings.parcelTypes.anon.Config, js.Promise[ConfigType] | ConfigType]
  ] = js.undefined
  
  /** Parse the contents into an ast */
  var parse: js.UndefOr[js.Function1[/* arg0 */ Options[ConfigType], Async[js.UndefOr[AST | Null]]]] = js.undefined
  
  /**
    * Do some processing after the transformation
    * @experimental
    */
  var postProcess: js.UndefOr[
    js.Function1[/* arg0 */ AssetsConfig[ConfigType], Async[js.Array[TransformerResult]]]
  ] = js.undefined
  
  /** Transform the asset and/or add new assets */
  def transform(arg0: Resolve[ConfigType]): Async[js.Array[TransformerResult | MutableAsset]]
}
object Transformer {
  
  inline def apply[ConfigType](transform: Resolve[ConfigType] => Async[js.Array[TransformerResult | MutableAsset]]): Transformer[ConfigType] = {
    val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
    __obj.asInstanceOf[Transformer[ConfigType]]
  }
  
  extension [Self <: Transformer[?], ConfigType](x: Self & Transformer[ConfigType]) {
    
    inline def setCanReuseAST(value: /* arg0 */ Ast => Boolean): Self = StObject.set(x, "canReuseAST", js.Any.fromFunction1(value))
    
    inline def setCanReuseASTUndefined: Self = StObject.set(x, "canReuseAST", js.undefined)
    
    inline def setGenerate(value: /* arg0 */ AssetAst => Async[GenerateOutput]): Self = StObject.set(x, "generate", js.Any.fromFunction1(value))
    
    inline def setGenerateUndefined: Self = StObject.set(x, "generate", js.undefined)
    
    inline def setLoadConfig(value: /* arg0 */ typings.parcelTypes.anon.Config => js.Promise[ConfigType] | ConfigType): Self = StObject.set(x, "loadConfig", js.Any.fromFunction1(value))
    
    inline def setLoadConfigUndefined: Self = StObject.set(x, "loadConfig", js.undefined)
    
    inline def setParse(value: /* arg0 */ Options[ConfigType] => Async[js.UndefOr[AST | Null]]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setPostProcess(value: /* arg0 */ AssetsConfig[ConfigType] => Async[js.Array[TransformerResult]]): Self = StObject.set(x, "postProcess", js.Any.fromFunction1(value))
    
    inline def setPostProcessUndefined: Self = StObject.set(x, "postProcess", js.undefined)
    
    inline def setTransform(value: Resolve[ConfigType] => Async[js.Array[TransformerResult | MutableAsset]]): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
  }
}
