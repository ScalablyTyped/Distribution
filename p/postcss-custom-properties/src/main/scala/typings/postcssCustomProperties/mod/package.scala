package typings.postcssCustomProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CustomPropertiesPlugin = typings.postcss.mod.Plugin_[typings.postcssCustomProperties.mod.Options] with typings.postcssCustomProperties.anon.Process
  /**
    * Sources where Custom Properties can be imported from or export to,
    * which might be CSS, JS, and JSON files, functions, and directly passed objects
    */
  type ExportSources = java.lang.String | typings.postcssCustomProperties.mod.CustomPropertiesObject | (js.Function1[
    /* customProperties */ typings.postcssCustomProperties.mod.CustomPropertiesObject, 
    js.Any
  ]) | js.Promise[typings.postcssCustomProperties.mod.CustomPropertiesObject]
  /**
    * Sources where Custom Properties can be imported from or export to,
    * which might be CSS, JS, and JSON files, functions, and directly passed objects
    */
  type ImportSources = java.lang.String | js.Function0[typings.postcssCustomProperties.mod.CustomPropertiesObject] | typings.postcssCustomProperties.mod.CustomPropertiesObject | js.Promise[typings.postcssCustomProperties.mod.CustomPropertiesObject]
}
