package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ServiceCallback[TResult] = js.Function4[
/* err */ js.Error | ServiceError, 
/* result */ js.UndefOr[TResult], 
/* request */ js.UndefOr[WebResource], 
/* response */ js.UndefOr[typings.node.httpMod.IncomingMessage], 
Unit]
