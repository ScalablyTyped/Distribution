package typings.meteorMdgValidatedMethod.mod

import org.scalablytyped.runtime.StringDictionary
import typings.meteor.Meteor.Error
import typings.meteorMdgValidatedMethod.anon.Name
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/mdg:validated-method", "ValidatedMethod")
@js.native
class ValidatedMethod[TName /* <: String */, TRun /* <: js.Function1[/* repeated */ js.Any, _] */] protected () extends js.Object {
  def this(options: (ValidatedMethodOptionsWithMixins[TName, TRun]) with (ThisType[ValidatedMethodThisBase with Name[TName]])) = this()
  
  var _execute: (js.Function2[/* context */ StringDictionary[js.Any], /* args */ Argument[TRun], Return[TRun]]) | (js.Function1[/* context */ StringDictionary[js.Any], Return[TRun]]) = js.native
  
  var call: ((js.Function2[
    /* arg */ Argument[TRun], 
    /* callback */ js.Function2[/* error */ Error, /* result */ Return[TRun], Unit], 
    Unit
  ]) with (js.Function1[/* arg */ Argument[TRun], Return[TRun]])) | ((js.Function2[
    /* unusedArg */ js.Any, 
    /* callback */ js.Function2[/* error */ Error, /* result */ Return[TRun], Unit], 
    Unit
  ]) with (js.Function1[
    /* callback */ js.Function2[/* error */ Error, /* result */ Return[TRun], Unit], 
    Unit
  ]) with js.Function0[Return[TRun]]) = js.native
}
