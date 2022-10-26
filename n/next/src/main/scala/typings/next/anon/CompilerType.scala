package typings.next.anon

import typings.next.distBuildEntriesMod.ObjectValue
import typings.next.distCompiledWebpackWebpackMod.webpack.EntryObject
import typings.next.distSharedLibConstantsMod.CompilerNameValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerType extends StObject {
  
  var compilerType: js.UndefOr[CompilerNameValues] = js.undefined
  
  var hasAppDir: js.UndefOr[Boolean] = js.undefined
  
  var isServerComponent: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var value: ObjectValue[EntryObject]
}
object CompilerType {
  
  inline def apply(name: String, value: ObjectValue[EntryObject]): CompilerType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilerType]
  }
  
  extension [Self <: CompilerType](x: Self) {
    
    inline def setCompilerType(value: CompilerNameValues): Self = StObject.set(x, "compilerType", value.asInstanceOf[js.Any])
    
    inline def setCompilerTypeUndefined: Self = StObject.set(x, "compilerType", js.undefined)
    
    inline def setHasAppDir(value: Boolean): Self = StObject.set(x, "hasAppDir", value.asInstanceOf[js.Any])
    
    inline def setHasAppDirUndefined: Self = StObject.set(x, "hasAppDir", js.undefined)
    
    inline def setIsServerComponent(value: Boolean): Self = StObject.set(x, "isServerComponent", value.asInstanceOf[js.Any])
    
    inline def setIsServerComponentUndefined: Self = StObject.set(x, "isServerComponent", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ObjectValue[EntryObject]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
