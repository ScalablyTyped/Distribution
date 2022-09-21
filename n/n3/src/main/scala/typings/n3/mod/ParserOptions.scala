package typings.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserOptions extends StObject {
  
  var baseIRI: js.UndefOr[String] = js.undefined
  
  var blankNodePrefix: js.UndefOr[String] = js.undefined
  
  var factory: js.UndefOr[
    typings.rdfjsTypes.dataModelMod.DataFactory[typings.rdfjsTypes.dataModelMod.Quad, typings.rdfjsTypes.dataModelMod.Quad]
  ] = js.undefined
  
  // string type is here to maintain backwards compatibility - consider removing when
  // updating major version
  var format: js.UndefOr[String | MimeFormat] = js.undefined
}
object ParserOptions {
  
  inline def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  
  extension [Self <: ParserOptions](x: Self) {
    
    inline def setBaseIRI(value: String): Self = StObject.set(x, "baseIRI", value.asInstanceOf[js.Any])
    
    inline def setBaseIRIUndefined: Self = StObject.set(x, "baseIRI", js.undefined)
    
    inline def setBlankNodePrefix(value: String): Self = StObject.set(x, "blankNodePrefix", value.asInstanceOf[js.Any])
    
    inline def setBlankNodePrefixUndefined: Self = StObject.set(x, "blankNodePrefix", js.undefined)
    
    inline def setFactory(
      value: typings.rdfjsTypes.dataModelMod.DataFactory[typings.rdfjsTypes.dataModelMod.Quad, typings.rdfjsTypes.dataModelMod.Quad]
    ): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    
    inline def setFormat(value: String | MimeFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
