package typings.pprofFormat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingInput extends StObject {
  
  var buildId: js.UndefOr[Numeric] = js.undefined
  
  var fileOffset: js.UndefOr[Numeric] = js.undefined
  
  var filename: js.UndefOr[Numeric] = js.undefined
  
  var hasFilenames: js.UndefOr[Boolean] = js.undefined
  
  var hasFunctions: js.UndefOr[Boolean] = js.undefined
  
  var hasInlineFrames: js.UndefOr[Boolean] = js.undefined
  
  var hasLineNumbers: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[Numeric] = js.undefined
  
  var memoryLimit: js.UndefOr[Numeric] = js.undefined
  
  var memoryStart: js.UndefOr[Numeric] = js.undefined
}
object MappingInput {
  
  inline def apply(): MappingInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingInput]
  }
  
  extension [Self <: MappingInput](x: Self) {
    
    inline def setBuildId(value: Numeric): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setBuildIdUndefined: Self = StObject.set(x, "buildId", js.undefined)
    
    inline def setFileOffset(value: Numeric): Self = StObject.set(x, "fileOffset", value.asInstanceOf[js.Any])
    
    inline def setFileOffsetUndefined: Self = StObject.set(x, "fileOffset", js.undefined)
    
    inline def setFilename(value: Numeric): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setHasFilenames(value: Boolean): Self = StObject.set(x, "hasFilenames", value.asInstanceOf[js.Any])
    
    inline def setHasFilenamesUndefined: Self = StObject.set(x, "hasFilenames", js.undefined)
    
    inline def setHasFunctions(value: Boolean): Self = StObject.set(x, "hasFunctions", value.asInstanceOf[js.Any])
    
    inline def setHasFunctionsUndefined: Self = StObject.set(x, "hasFunctions", js.undefined)
    
    inline def setHasInlineFrames(value: Boolean): Self = StObject.set(x, "hasInlineFrames", value.asInstanceOf[js.Any])
    
    inline def setHasInlineFramesUndefined: Self = StObject.set(x, "hasInlineFrames", js.undefined)
    
    inline def setHasLineNumbers(value: Boolean): Self = StObject.set(x, "hasLineNumbers", value.asInstanceOf[js.Any])
    
    inline def setHasLineNumbersUndefined: Self = StObject.set(x, "hasLineNumbers", js.undefined)
    
    inline def setId(value: Numeric): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMemoryLimit(value: Numeric): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
    
    inline def setMemoryLimitUndefined: Self = StObject.set(x, "memoryLimit", js.undefined)
    
    inline def setMemoryStart(value: Numeric): Self = StObject.set(x, "memoryStart", value.asInstanceOf[js.Any])
    
    inline def setMemoryStartUndefined: Self = StObject.set(x, "memoryStart", js.undefined)
  }
}
