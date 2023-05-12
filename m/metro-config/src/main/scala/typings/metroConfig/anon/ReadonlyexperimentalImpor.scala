package typings.metroConfig.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  experimentalImportSupport :boolean,   inlineRequires :{  blockList :{[path: string] : true}} | boolean,   nonInlinedRequires :std.ReadonlyArray<string> | undefined,   unstable_disableES6Transforms :boolean | undefined}> */
trait ReadonlyexperimentalImpor extends StObject {
  
  val experimentalImportSupport: Boolean
  
  val inlineRequires: BlockList | Boolean
  
  val nonInlinedRequires: js.UndefOr[js.Array[String]] = js.undefined
  
  val unstable_disableES6Transforms: js.UndefOr[Boolean] = js.undefined
}
object ReadonlyexperimentalImpor {
  
  inline def apply(experimentalImportSupport: Boolean, inlineRequires: BlockList | Boolean): ReadonlyexperimentalImpor = {
    val __obj = js.Dynamic.literal(experimentalImportSupport = experimentalImportSupport.asInstanceOf[js.Any], inlineRequires = inlineRequires.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyexperimentalImpor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyexperimentalImpor] (val x: Self) extends AnyVal {
    
    inline def setExperimentalImportSupport(value: Boolean): Self = StObject.set(x, "experimentalImportSupport", value.asInstanceOf[js.Any])
    
    inline def setInlineRequires(value: BlockList | Boolean): Self = StObject.set(x, "inlineRequires", value.asInstanceOf[js.Any])
    
    inline def setNonInlinedRequires(value: js.Array[String]): Self = StObject.set(x, "nonInlinedRequires", value.asInstanceOf[js.Any])
    
    inline def setNonInlinedRequiresUndefined: Self = StObject.set(x, "nonInlinedRequires", js.undefined)
    
    inline def setNonInlinedRequiresVarargs(value: String*): Self = StObject.set(x, "nonInlinedRequires", js.Array(value*))
    
    inline def setUnstable_disableES6Transforms(value: Boolean): Self = StObject.set(x, "unstable_disableES6Transforms", value.asInstanceOf[js.Any])
    
    inline def setUnstable_disableES6TransformsUndefined: Self = StObject.set(x, "unstable_disableES6Transforms", js.undefined)
  }
}
