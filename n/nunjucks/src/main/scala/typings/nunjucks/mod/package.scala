package typings.nunjucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[E, T] = js.Function2[/* err */ E | scala.Null, /* res */ T | scala.Null, scala.Unit]
  
  type TemplateCallback[T] = js.Function2[
    /* err */ typings.nunjucks.mod.lib.TemplateError | scala.Null, 
    /* res */ T | scala.Null, 
    scala.Unit
  ]
}
