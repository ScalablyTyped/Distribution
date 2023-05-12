package typings.metroFileMap.srcFlowTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  computeDependencies :boolean,   computeSha1 :boolean,   dependencyExtractor :string | null | undefined,   enableHastePackages :boolean,   readLink :boolean,   rootDir :string,   filePath :string,   hasteImplModulePath :string | null | undefined}> */
trait WorkerMessage extends StObject {
  
  val computeDependencies: Boolean
  
  val computeSha1: Boolean
  
  val dependencyExtractor: js.UndefOr[String | Null] = js.undefined
  
  val enableHastePackages: Boolean
  
  val filePath: String
  
  val hasteImplModulePath: js.UndefOr[String | Null] = js.undefined
  
  val readLink: Boolean
  
  val rootDir: String
}
object WorkerMessage {
  
  inline def apply(
    computeDependencies: Boolean,
    computeSha1: Boolean,
    enableHastePackages: Boolean,
    filePath: String,
    readLink: Boolean,
    rootDir: String
  ): WorkerMessage = {
    val __obj = js.Dynamic.literal(computeDependencies = computeDependencies.asInstanceOf[js.Any], computeSha1 = computeSha1.asInstanceOf[js.Any], enableHastePackages = enableHastePackages.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], readLink = readLink.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerMessage] (val x: Self) extends AnyVal {
    
    inline def setComputeDependencies(value: Boolean): Self = StObject.set(x, "computeDependencies", value.asInstanceOf[js.Any])
    
    inline def setComputeSha1(value: Boolean): Self = StObject.set(x, "computeSha1", value.asInstanceOf[js.Any])
    
    inline def setDependencyExtractor(value: String): Self = StObject.set(x, "dependencyExtractor", value.asInstanceOf[js.Any])
    
    inline def setDependencyExtractorNull: Self = StObject.set(x, "dependencyExtractor", null)
    
    inline def setDependencyExtractorUndefined: Self = StObject.set(x, "dependencyExtractor", js.undefined)
    
    inline def setEnableHastePackages(value: Boolean): Self = StObject.set(x, "enableHastePackages", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setHasteImplModulePath(value: String): Self = StObject.set(x, "hasteImplModulePath", value.asInstanceOf[js.Any])
    
    inline def setHasteImplModulePathNull: Self = StObject.set(x, "hasteImplModulePath", null)
    
    inline def setHasteImplModulePathUndefined: Self = StObject.set(x, "hasteImplModulePath", js.undefined)
    
    inline def setReadLink(value: Boolean): Self = StObject.set(x, "readLink", value.asInstanceOf[js.Any])
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
  }
}
