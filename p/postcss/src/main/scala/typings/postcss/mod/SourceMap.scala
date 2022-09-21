package typings.postcss.mod

import typings.sourceMapJs.mod.RawSourceMap
import typings.sourceMapJs.mod.SourceMapGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceMap extends SourceMapGenerator {
  
  def toJSON(): RawSourceMap = js.native
}
