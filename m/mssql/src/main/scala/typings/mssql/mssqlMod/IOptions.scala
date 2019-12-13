package typings.mssql.mssqlMod

import typings.tedious.tediousMod.ColumnMetaData
import typings.tedious.tediousMod.ConnectionOptions
import typings.tedious.tediousMod.DebugOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends ConnectionOptions {
  var beforeConnect: js.UndefOr[Unit] = js.undefined
  var connectionString: js.UndefOr[String] = js.undefined
  var trustedConnection: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    abortTransactionOnError: js.UndefOr[Boolean] = js.undefined,
    appName: String = null,
    beforeConnect: js.UndefOr[Unit] = js.undefined,
    camelCaseColumns: js.UndefOr[Boolean] = js.undefined,
    cancelTimeout: scala.Int | Double = null,
    columnNameReplacer: (/* columnName */ String, /* index */ Double, /* columnMetaData */ ColumnMetaData) => String = null,
    connectTimeout: scala.Int | Double = null,
    connectionIsolationLevel: typings.tedious.tediousMod.ISOLATION_LEVEL = null,
    connectionRetryInterval: scala.Int | Double = null,
    connectionString: String = null,
    cryptoCredentialsDetails: js.Object = null,
    database: String = null,
    dateFormat: String = null,
    datefirst: scala.Int | Double = null,
    debug: DebugOptions = null,
    enableAnsiNull: js.UndefOr[Boolean] = js.undefined,
    enableAnsiNullDefault: js.UndefOr[Boolean] = js.undefined,
    enableAnsiPadding: js.UndefOr[Boolean] = js.undefined,
    enableAnsiWarnings: js.UndefOr[Boolean] = js.undefined,
    enableArithAbort: js.UndefOr[Boolean] = js.undefined,
    enableConcatNullYieldsNull: js.UndefOr[Boolean] = js.undefined,
    enableCursorCloseOnCommit: js.UndefOr[Boolean] = js.undefined,
    enableImplicitTransactions: js.UndefOr[Boolean] = js.undefined,
    enableNumericRoundabort: js.UndefOr[Boolean] = js.undefined,
    enableQuotedIdentifier: js.UndefOr[Boolean] = js.undefined,
    encrypt: js.UndefOr[Boolean] = js.undefined,
    fallbackToDefaultDb: js.UndefOr[Boolean] = js.undefined,
    instanceName: String = null,
    isolationLevel: typings.tedious.tediousMod.ISOLATION_LEVEL = null,
    language: String = null,
    localAddress: String = null,
    maxRetriesOnTransientErrors: scala.Int | Double = null,
    packetSize: scala.Int | Double = null,
    port: scala.Int | Double = null,
    readOnlyIntent: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: scala.Int | Double = null,
    rowCollectionOnDone: js.UndefOr[Boolean] = js.undefined,
    rowCollectionOnRequestCompletion: js.UndefOr[Boolean] = js.undefined,
    tdsVersion: scala.Int | Double = null,
    textsize: scala.Int | Double = null,
    trustServerCertificate: js.UndefOr[Boolean] = js.undefined,
    trustedConnection: js.UndefOr[Boolean] = js.undefined,
    useColumnNames: js.UndefOr[Boolean] = js.undefined,
    useUTC: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortTransactionOnError)) __obj.updateDynamic("abortTransactionOnError")(abortTransactionOnError.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (!js.isUndefined(beforeConnect)) __obj.updateDynamic("beforeConnect")(beforeConnect.asInstanceOf[js.Any])
    if (!js.isUndefined(camelCaseColumns)) __obj.updateDynamic("camelCaseColumns")(camelCaseColumns.asInstanceOf[js.Any])
    if (cancelTimeout != null) __obj.updateDynamic("cancelTimeout")(cancelTimeout.asInstanceOf[js.Any])
    if (columnNameReplacer != null) __obj.updateDynamic("columnNameReplacer")(js.Any.fromFunction3(columnNameReplacer))
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (connectionIsolationLevel != null) __obj.updateDynamic("connectionIsolationLevel")(connectionIsolationLevel.asInstanceOf[js.Any])
    if (connectionRetryInterval != null) __obj.updateDynamic("connectionRetryInterval")(connectionRetryInterval.asInstanceOf[js.Any])
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (cryptoCredentialsDetails != null) __obj.updateDynamic("cryptoCredentialsDetails")(cryptoCredentialsDetails.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (datefirst != null) __obj.updateDynamic("datefirst")(datefirst.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiNull)) __obj.updateDynamic("enableAnsiNull")(enableAnsiNull.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiNullDefault)) __obj.updateDynamic("enableAnsiNullDefault")(enableAnsiNullDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiPadding)) __obj.updateDynamic("enableAnsiPadding")(enableAnsiPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiWarnings)) __obj.updateDynamic("enableAnsiWarnings")(enableAnsiWarnings.asInstanceOf[js.Any])
    if (!js.isUndefined(enableArithAbort)) __obj.updateDynamic("enableArithAbort")(enableArithAbort.asInstanceOf[js.Any])
    if (!js.isUndefined(enableConcatNullYieldsNull)) __obj.updateDynamic("enableConcatNullYieldsNull")(enableConcatNullYieldsNull.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCursorCloseOnCommit)) __obj.updateDynamic("enableCursorCloseOnCommit")(enableCursorCloseOnCommit.asInstanceOf[js.Any])
    if (!js.isUndefined(enableImplicitTransactions)) __obj.updateDynamic("enableImplicitTransactions")(enableImplicitTransactions.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNumericRoundabort)) __obj.updateDynamic("enableNumericRoundabort")(enableNumericRoundabort.asInstanceOf[js.Any])
    if (!js.isUndefined(enableQuotedIdentifier)) __obj.updateDynamic("enableQuotedIdentifier")(enableQuotedIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackToDefaultDb)) __obj.updateDynamic("fallbackToDefaultDb")(fallbackToDefaultDb.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (isolationLevel != null) __obj.updateDynamic("isolationLevel")(isolationLevel.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (maxRetriesOnTransientErrors != null) __obj.updateDynamic("maxRetriesOnTransientErrors")(maxRetriesOnTransientErrors.asInstanceOf[js.Any])
    if (packetSize != null) __obj.updateDynamic("packetSize")(packetSize.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnlyIntent)) __obj.updateDynamic("readOnlyIntent")(readOnlyIntent.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCollectionOnDone)) __obj.updateDynamic("rowCollectionOnDone")(rowCollectionOnDone.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCollectionOnRequestCompletion)) __obj.updateDynamic("rowCollectionOnRequestCompletion")(rowCollectionOnRequestCompletion.asInstanceOf[js.Any])
    if (tdsVersion != null) __obj.updateDynamic("tdsVersion")(tdsVersion.asInstanceOf[js.Any])
    if (textsize != null) __obj.updateDynamic("textsize")(textsize.asInstanceOf[js.Any])
    if (!js.isUndefined(trustServerCertificate)) __obj.updateDynamic("trustServerCertificate")(trustServerCertificate.asInstanceOf[js.Any])
    if (!js.isUndefined(trustedConnection)) __obj.updateDynamic("trustedConnection")(trustedConnection.asInstanceOf[js.Any])
    if (!js.isUndefined(useColumnNames)) __obj.updateDynamic("useColumnNames")(useColumnNames.asInstanceOf[js.Any])
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

