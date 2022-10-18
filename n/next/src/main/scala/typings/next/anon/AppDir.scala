package typings.next.anon

import typings.next.distBuildEntriesMod.ObjectValue
import typings.next.distCompiledWebpackWebpackMod.webpack.EntryObject
import typings.next.distSharedLibConstantsMod.CompilerNameValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppDir extends StObject {
  
  var appDir: js.UndefOr[Boolean] = js.undefined
  
  var compilerType: js.UndefOr[CompilerNameValues] = js.undefined
  
  var isServerComponent: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var value: ObjectValue[EntryObject]
}
object AppDir {
  
  inline def apply(name: String, value: ObjectValue[EntryObject]): AppDir = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppDir]
  }
  
  extension [Self <: AppDir](x: Self) {
    
    inline def setAppDir(value: Boolean): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setAppDirUndefined: Self = StObject.set(x, "appDir", js.undefined)
    
    inline def setCompilerType(value: CompilerNameValues): Self = StObject.set(x, "compilerType", value.asInstanceOf[js.Any])
    
    inline def setCompilerTypeUndefined: Self = StObject.set(x, "compilerType", js.undefined)
    
    inline def setIsServerComponent(value: Boolean): Self = StObject.set(x, "isServerComponent", value.asInstanceOf[js.Any])
    
    inline def setIsServerComponentUndefined: Self = StObject.set(x, "isServerComponent", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: ObjectValue[EntryObject]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
