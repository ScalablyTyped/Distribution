package typings.mockDashAwsDashS3.mockDashAwsDashS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GlobalConfigInstance * / any */ trait MockConfigInstance extends js.Object {
  var basePath: String
}

object MockConfigInstance {
  @scala.inline
  def apply(basePath: String): MockConfigInstance = {
    val __obj = js.Dynamic.literal(basePath = basePath)
  
    __obj.asInstanceOf[MockConfigInstance]
  }
}

