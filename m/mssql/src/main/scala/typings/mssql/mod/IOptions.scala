package typings.mssql.mod

import typings.tedious.mod.ColumnMetaData
import typings.tedious.mod.ConnectionOptions
import typings.tedious.mod.DebugOptions
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
    cancelTimeout: js.UndefOr[Double] = js.undefined,
    columnNameReplacer: (/* columnName */ String, /* index */ Double, /* columnMetaData */ ColumnMetaData) => String = null,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    connectionIsolationLevel: typings.tedious.mod.ISOLATION_LEVEL = null,
    connectionRetryInterval: js.UndefOr[Double] = js.undefined,
    connectionString: String = null,
    cryptoCredentialsDetails: js.Object = null,
    database: String = null,
    dateFormat: String = null,
    datefirst: js.UndefOr[Double] = js.undefined,
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
    isolationLevel: typings.tedious.mod.ISOLATION_LEVEL = null,
    language: String = null,
    localAddress: String = null,
    maxRetriesOnTransientErrors: js.UndefOr[Double] = js.undefined,
    packetSize: js.UndefOr[Double] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    readOnlyIntent: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    rowCollectionOnDone: js.UndefOr[Boolean] = js.undefined,
    rowCollectionOnRequestCompletion: js.UndefOr[Boolean] = js.undefined,
    tdsVersion: js.UndefOr[Double] = js.undefined,
    textsize: js.UndefOr[Double] = js.undefined,
    trustServerCertificate: js.UndefOr[Boolean] = js.undefined,
    trustedConnection: js.UndefOr[Boolean] = js.undefined,
    useColumnNames: js.UndefOr[Boolean] = js.undefined,
    useUTC: js.UndefOr[Boolean] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortTransactionOnError)) __obj.updateDynamic("abortTransactionOnError")(abortTransactionOnError.get.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (!js.isUndefined(beforeConnect)) __obj.updateDynamic("beforeConnect")(beforeConnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(camelCaseColumns)) __obj.updateDynamic("camelCaseColumns")(camelCaseColumns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelTimeout)) __obj.updateDynamic("cancelTimeout")(cancelTimeout.get.asInstanceOf[js.Any])
    if (columnNameReplacer != null) __obj.updateDynamic("columnNameReplacer")(js.Any.fromFunction3(columnNameReplacer))
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (connectionIsolationLevel != null) __obj.updateDynamic("connectionIsolationLevel")(connectionIsolationLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(connectionRetryInterval)) __obj.updateDynamic("connectionRetryInterval")(connectionRetryInterval.get.asInstanceOf[js.Any])
    if (connectionString != null) __obj.updateDynamic("connectionString")(connectionString.asInstanceOf[js.Any])
    if (cryptoCredentialsDetails != null) __obj.updateDynamic("cryptoCredentialsDetails")(cryptoCredentialsDetails.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(datefirst)) __obj.updateDynamic("datefirst")(datefirst.get.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiNull)) __obj.updateDynamic("enableAnsiNull")(enableAnsiNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiNullDefault)) __obj.updateDynamic("enableAnsiNullDefault")(enableAnsiNullDefault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiPadding)) __obj.updateDynamic("enableAnsiPadding")(enableAnsiPadding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAnsiWarnings)) __obj.updateDynamic("enableAnsiWarnings")(enableAnsiWarnings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableArithAbort)) __obj.updateDynamic("enableArithAbort")(enableArithAbort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableConcatNullYieldsNull)) __obj.updateDynamic("enableConcatNullYieldsNull")(enableConcatNullYieldsNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCursorCloseOnCommit)) __obj.updateDynamic("enableCursorCloseOnCommit")(enableCursorCloseOnCommit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableImplicitTransactions)) __obj.updateDynamic("enableImplicitTransactions")(enableImplicitTransactions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableNumericRoundabort)) __obj.updateDynamic("enableNumericRoundabort")(enableNumericRoundabort.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableQuotedIdentifier)) __obj.updateDynamic("enableQuotedIdentifier")(enableQuotedIdentifier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fallbackToDefaultDb)) __obj.updateDynamic("fallbackToDefaultDb")(fallbackToDefaultDb.get.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (isolationLevel != null) __obj.updateDynamic("isolationLevel")(isolationLevel.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetriesOnTransientErrors)) __obj.updateDynamic("maxRetriesOnTransientErrors")(maxRetriesOnTransientErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(packetSize)) __obj.updateDynamic("packetSize")(packetSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnlyIntent)) __obj.updateDynamic("readOnlyIntent")(readOnlyIntent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCollectionOnDone)) __obj.updateDynamic("rowCollectionOnDone")(rowCollectionOnDone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowCollectionOnRequestCompletion)) __obj.updateDynamic("rowCollectionOnRequestCompletion")(rowCollectionOnRequestCompletion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tdsVersion)) __obj.updateDynamic("tdsVersion")(tdsVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(textsize)) __obj.updateDynamic("textsize")(textsize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trustServerCertificate)) __obj.updateDynamic("trustServerCertificate")(trustServerCertificate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trustedConnection)) __obj.updateDynamic("trustedConnection")(trustedConnection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useColumnNames)) __obj.updateDynamic("useColumnNames")(useColumnNames.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

