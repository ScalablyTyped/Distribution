package typings.minimistOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BooleanArrayOption = typings.minimistOptions.mod.BaseOption[
    typings.minimistOptions.minimistOptionsStrings.`boolean-array`, 
    js.Array[scala.Boolean]
  ]
  
  type BooleanOption = typings.minimistOptions.mod.BaseOption[typings.minimistOptions.minimistOptionsStrings.boolean, scala.Boolean]
  
  type DefaultArrayOption = typings.minimistOptions.mod.BaseOption[typings.minimistOptions.minimistOptionsStrings.array, js.Array[java.lang.String]]
  
  type MinimistOption = typings.std.NonNullable[
    js.UndefOr[scala.Boolean | (js.Function1[/* arg */ java.lang.String, scala.Boolean])]
  ]
  
  type NumberArrayOption = typings.minimistOptions.mod.BaseOption[
    typings.minimistOptions.minimistOptionsStrings.`number-array`, 
    js.Array[scala.Double]
  ]
  
  type NumberOption = typings.minimistOptions.mod.BaseOption[typings.minimistOptions.minimistOptionsStrings.number, scala.Double]
  
  type Options = org.scalablytyped.runtime.StringDictionary[
    typings.minimistOptions.mod.OptionType | typings.minimistOptions.mod.StringOption | typings.minimistOptions.mod.BooleanOption | typings.minimistOptions.mod.NumberOption | typings.minimistOptions.mod.DefaultArrayOption | typings.minimistOptions.mod.StringArrayOption | typings.minimistOptions.mod.BooleanArrayOption | typings.minimistOptions.mod.NumberArrayOption | typings.minimistOptions.mod.MinimistOption
  ]
  
  type StringArrayOption = typings.minimistOptions.mod.BaseOption[
    typings.minimistOptions.minimistOptionsStrings.`string-array`, 
    js.Array[java.lang.String]
  ]
  
  type StringOption = typings.minimistOptions.mod.BaseOption[typings.minimistOptions.minimistOptionsStrings.string, java.lang.String]
}
