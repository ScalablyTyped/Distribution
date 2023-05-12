package typings.metroFileMap.srcFlowTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  dependencies :std.ReadonlyArray<string> | undefined,   id :string | null | undefined,   module :metro-file-map.metro-file-map/src/flow-types.ModuleMetaData | null | undefined,   sha1 :string | null | undefined,   symlinkTarget :string | null | undefined}> */
trait WorkerMetadata extends StObject {
  
  val dependencies: js.UndefOr[js.Array[String]] = js.undefined
  
  val id: js.UndefOr[String | Null] = js.undefined
  
  val module: js.UndefOr[ModuleMetaData | Null] = js.undefined
  
  val sha1: js.UndefOr[String | Null] = js.undefined
  
  val symlinkTarget: js.UndefOr[String | Null] = js.undefined
}
object WorkerMetadata {
  
  inline def apply(): WorkerMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerMetadata] (val x: Self) extends AnyVal {
    
    inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setModule(value: ModuleMetaData): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleNull: Self = StObject.set(x, "module", null)
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha1Null: Self = StObject.set(x, "sha1", null)
    
    inline def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    inline def setSymlinkTarget(value: String): Self = StObject.set(x, "symlinkTarget", value.asInstanceOf[js.Any])
    
    inline def setSymlinkTargetNull: Self = StObject.set(x, "symlinkTarget", null)
    
    inline def setSymlinkTargetUndefined: Self = StObject.set(x, "symlinkTarget", js.undefined)
  }
}
