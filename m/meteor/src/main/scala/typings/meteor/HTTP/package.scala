package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object HTTP {
  
  type AsyncCallback = js.Function2[
    /* error */ typings.meteor.Meteor.Error | scala.Null, 
    /* result */ js.UndefOr[typings.meteor.HTTP.HTTPResponse], 
    scala.Unit
  ]
}
