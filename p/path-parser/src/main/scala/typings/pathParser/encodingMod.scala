package typings.pathParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("path-parser/dist/encoding", "decodeParam")
  @js.native
  def decodeParam(param: String, encoding: URLParamsEncodingType): String = js.native
  
  @JSImport("path-parser/dist/encoding", "encodeParam")
  @js.native
  def encodeParam(param: String, encoding: URLParamsEncodingType, isSpatParam: Boolean): String = js.native
  @JSImport("path-parser/dist/encoding", "encodeParam")
  @js.native
  def encodeParam(param: Boolean, encoding: URLParamsEncodingType, isSpatParam: Boolean): String = js.native
  @JSImport("path-parser/dist/encoding", "encodeParam")
  @js.native
  def encodeParam(param: Double, encoding: URLParamsEncodingType, isSpatParam: Boolean): String = js.native
  
  @JSImport("path-parser/dist/encoding", "encodeURIComponentExcludingSubDelims")
  @js.native
  def encodeURIComponentExcludingSubDelims(segment: String): String = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.pathParser.pathParserStrings.default
    - typings.pathParser.pathParserStrings.uri
    - typings.pathParser.pathParserStrings.uriComponent
    - typings.pathParser.pathParserStrings.none
    - typings.pathParser.pathParserStrings.legacy
  */
  trait URLParamsEncodingType extends StObject
  object URLParamsEncodingType {
    
    @scala.inline
    def default: typings.pathParser.pathParserStrings.default = "default".asInstanceOf[typings.pathParser.pathParserStrings.default]
    
    @scala.inline
    def legacy: typings.pathParser.pathParserStrings.legacy = "legacy".asInstanceOf[typings.pathParser.pathParserStrings.legacy]
    
    @scala.inline
    def none: typings.pathParser.pathParserStrings.none = "none".asInstanceOf[typings.pathParser.pathParserStrings.none]
    
    @scala.inline
    def uri: typings.pathParser.pathParserStrings.uri = "uri".asInstanceOf[typings.pathParser.pathParserStrings.uri]
    
    @scala.inline
    def uriComponent: typings.pathParser.pathParserStrings.uriComponent = "uriComponent".asInstanceOf[typings.pathParser.pathParserStrings.uriComponent]
  }
}
