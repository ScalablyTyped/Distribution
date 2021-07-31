package typings.nodeMailjet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def connect(apiKey: java.lang.String, apiSecret: java.lang.String): typings.nodeMailjet.mod.Email.Client = (typings.nodeMailjet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiKey.asInstanceOf[js.Any], apiSecret.asInstanceOf[js.Any])).asInstanceOf[typings.nodeMailjet.mod.Email.Client]
@scala.inline
def connect(
  apiKey: java.lang.String,
  apiSecret: java.lang.String,
  options: typings.nodeMailjet.mod.ConnectOptions
): typings.nodeMailjet.mod.Email.Client = (typings.nodeMailjet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiKey.asInstanceOf[js.Any], apiSecret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeMailjet.mod.Email.Client]
@scala.inline
def connect(apiToken: java.lang.String): typings.nodeMailjet.mod.SMS.Client = typings.nodeMailjet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiToken.asInstanceOf[js.Any]).asInstanceOf[typings.nodeMailjet.mod.SMS.Client]
@scala.inline
def connect(apiToken: java.lang.String, options: typings.nodeMailjet.mod.ConnectOptions): typings.nodeMailjet.mod.SMS.Client = (typings.nodeMailjet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connect")(apiToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.nodeMailjet.mod.SMS.Client]
