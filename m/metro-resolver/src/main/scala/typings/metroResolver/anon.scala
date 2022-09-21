package typings.metroResolver

import typings.metroResolver.metroResolverStrings.asset
import typings.metroResolver.metroResolverStrings.assetFiles
import typings.metroResolver.metroResolverStrings.empty
import typings.metroResolver.metroResolverStrings.failed
import typings.metroResolver.metroResolverStrings.resolved
import typings.metroResolver.metroResolverStrings.sourceFile
import typings.metroResolver.typesMod.AssetFileResolution
import typings.metroResolver.typesMod.FileCandidates
import typings.metroResolver.typesMod.FileResolution
import typings.metroResolver.typesMod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CandidateExts
    extends StObject
       with FileCandidates {
    
    val candidateExts: js.Array[String]
    
    var filePathPrefix: String
    
    val `type`: sourceFile
  }
  object CandidateExts {
    
    inline def apply(candidateExts: js.Array[String], filePathPrefix: String): CandidateExts = {
      val __obj = js.Dynamic.literal(candidateExts = candidateExts.asInstanceOf[js.Any], filePathPrefix = filePathPrefix.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sourceFile")
      __obj.asInstanceOf[CandidateExts]
    }
    
    extension [Self <: CandidateExts](x: Self) {
      
      inline def setCandidateExts(value: js.Array[String]): Self = StObject.set(x, "candidateExts", value.asInstanceOf[js.Any])
      
      inline def setCandidateExtsVarargs(value: String*): Self = StObject.set(x, "candidateExts", js.Array(value*))
      
      inline def setFilePathPrefix(value: String): Self = StObject.set(x, "filePathPrefix", value.asInstanceOf[js.Any])
      
      inline def setType(value: sourceFile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Candidates[TCandidates]
    extends StObject
       with Result[Any, TCandidates] {
    
    val candidates: TCandidates
    
    val `type`: failed
  }
  object Candidates {
    
    inline def apply[TCandidates](candidates: TCandidates): Candidates[TCandidates] = {
      val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("failed")
      __obj.asInstanceOf[Candidates[TCandidates]]
    }
    
    extension [Self <: Candidates[?], TCandidates](x: Self & Candidates[TCandidates]) {
      
      inline def setCandidates(value: TCandidates): Self = StObject.set(x, "candidates", value.asInstanceOf[js.Any])
      
      inline def setType(value: failed): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilePath
    extends StObject
       with FileResolution {
    
    val filePath: String
    
    val `type`: sourceFile
  }
  object FilePath {
    
    inline def apply(filePath: String): FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("sourceFile")
      __obj.asInstanceOf[FilePath]
    }
    
    extension [Self <: FilePath](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setType(value: sourceFile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FilePaths
    extends StObject
       with FileResolution {
    
    val filePaths: AssetFileResolution
    
    val `type`: assetFiles
  }
  object FilePaths {
    
    inline def apply(filePaths: AssetFileResolution): FilePaths = {
      val __obj = js.Dynamic.literal(filePaths = filePaths.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("assetFiles")
      __obj.asInstanceOf[FilePaths]
    }
    
    extension [Self <: FilePaths](x: Self) {
      
      inline def setFilePaths(value: AssetFileResolution): Self = StObject.set(x, "filePaths", value.asInstanceOf[js.Any])
      
      inline def setFilePathsVarargs(value: String*): Self = StObject.set(x, "filePaths", js.Array(value*))
      
      inline def setType(value: assetFiles): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name
    extends StObject
       with FileCandidates {
    
    val name: String
    
    val `type`: asset
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("asset")
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Resolution[TResolution]
    extends StObject
       with Result[TResolution, Any] {
    
    val resolution: TResolution
    
    val `type`: resolved
  }
  object Resolution {
    
    inline def apply[TResolution](resolution: TResolution): Resolution[TResolution] = {
      val __obj = js.Dynamic.literal(resolution = resolution.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("resolved")
      __obj.asInstanceOf[Resolution[TResolution]]
    }
    
    extension [Self <: Resolution[?], TResolution](x: Self & Resolution[TResolution]) {
      
      inline def setResolution(value: TResolution): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setType(value: resolved): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type
    extends StObject
       with typings.metroResolver.typesMod.Resolution {
    
    val `type`: empty
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("empty")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: empty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
