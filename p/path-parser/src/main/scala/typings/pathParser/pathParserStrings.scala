package typings.pathParser

import typings.pathParser.encodingMod.URLParamsEncodingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathParserStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with URLParamsEncodingType
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait legacy
    extends StObject
       with URLParamsEncodingType
  inline def legacy: legacy = "legacy".asInstanceOf[legacy]
  
  @js.native
  sealed trait none
    extends StObject
       with URLParamsEncodingType
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait uri
    extends StObject
       with URLParamsEncodingType
  inline def uri: uri = "uri".asInstanceOf[uri]
  
  @js.native
  sealed trait uriComponent
    extends StObject
       with URLParamsEncodingType
  inline def uriComponent: uriComponent = "uriComponent".asInstanceOf[uriComponent]
}
