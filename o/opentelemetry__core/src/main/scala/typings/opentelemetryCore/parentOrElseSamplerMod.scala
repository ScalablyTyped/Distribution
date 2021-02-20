package typings.opentelemetryCore

import typings.opentelemetryApi.samplerMod.Sampler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parentOrElseSamplerMod {
  
  @JSImport("@opentelemetry/core/build/src/trace/sampler/ParentOrElseSampler", "ParentOrElseSampler")
  @js.native
  class ParentOrElseSampler protected () extends Sampler {
    def this(_delegateSampler: Sampler) = this()
    
    var _delegateSampler: js.Any = js.native
  }
}
