package typings.openssiWebsdk.mod

import typings.openssiWebsdk.openssiWebsdkStrings.debug
import typings.openssiWebsdk.openssiWebsdkStrings.error
import typings.openssiWebsdk.openssiWebsdkStrings.fatal
import typings.openssiWebsdk.openssiWebsdkStrings.info
import typings.openssiWebsdk.openssiWebsdkStrings.trace
import typings.openssiWebsdk.openssiWebsdkStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openssi-websdk", "Agent")
@js.native
class Agent protected () extends js.Object {
  def this(account_url: String, agent_name: String, agent_password: String, friendly_name: String) = this()
  def this(
    account_url: String,
    agent_name: String,
    agent_password: String,
    friendly_name: String,
    log_level: String
  ) = this()
  /**
    * Accept a connection offer.  If a connection id is passed, that connection will be updated from state
    * `inbound_offer` to `connected` on this agent.  If a connection offer object from another agent is passed, the
    * connection will be created and set to the `connected` state on this agent.
    * {string|Connection} connection The ID for an existing connection, or an out-of-band connection offer.
    * {Properties} [properties] Optional metadata to add to the connection offer.
    * Returns {Promise<Connection>} The updated connection information.
    */
  def acceptConnection(connection: String): js.Promise[Connection] = js.native
  def acceptConnection(connection: String, properties: Properties): js.Promise[Connection] = js.native
  def acceptConnection(connection: Connection): js.Promise[Connection] = js.native
  def acceptConnection(connection: Connection, properties: Properties): js.Promise[Connection] = js.native
  /**
    * Create a {Connection}.  If recipient information is provided, the agent will attempt to contact the
    * recipient agent and create an inbound connection offer on that agent.  Otherwise, the connection offer is only
    * created on this agent, and the returned object must be passed to the intended recipient agent out-of-band in
    * order to establish the connection.
    * {ConnectionRecipient} [to] The recipient agent.
    * {Properties} [properties] Optional metadata to add to the connection offer.
    * Returns {Promise<Connection>} The connection offer, or the active {Connection} if one is already established.
    */
  def createConnection(): js.Promise[Connection] = js.native
  def createConnection(to: Null, properties: Properties): js.Promise[Connection] = js.native
  def createConnection(to: ConnectionRecipient): js.Promise[Connection] = js.native
  def createConnection(to: ConnectionRecipient, properties: Properties): js.Promise[Connection] = js.native
  /**
    * Create a {CredentialDefinition}
    * {CredentialSchemaID} schemaId The ledger ID for the schema.
    * Returns {Promise<CredentialDefinition>} The created credential definition.
    */
  def createCredentialDefinition(schemaId: CredentialSchemaID): js.Promise[CredentialDefinition] = js.native
  /**
    * Creates a {CredentialSchema}, meaning the schema is published on the ledger.
    * {string} name The name of the schema.
    * {string} version A tuple representing the schema version (1.0, 1.1.2, etc.)
    * {string[]} attributes The list of attributes credentials based on this schema must have.
    * Returns {Promise<CredentialSchema>} A promise that resolves with the new schema record.
    */
  def createCredentialSchema(name: String, version: String, attributes: js.Array[String]): js.Promise[CredentialSchema] = js.native
  /**
    * Create a {AgentInfo} on the account.  If self_registration is disabled, you have to create an agent with
    * some password, and then change that password as the agent that was created.  This function attempts to handle
    * both self-registration and non-self-registration scenarios.
    * {string} account_admin_agent_name The admin agent on this agent's account. Only needed if create is true.
    * {string} account_admin_agent_password The admin agent's password.
    * Returns {Promise<AgentInfo>} A promise that resolves with information about the agent that was created.
    */
  def createIdentity(account_admin_agent_name: String, account_admin_agent_password: String): js.Promise[AgentInfo] = js.native
  /**
    * Create a {ProofSchema}.
    * {string} name The name of the schema.
    * {string} version The version of the schema.
    * {object<ProofSchemaAttribute>} [requestedAttributes] A list of requested attributes.
    * {object<ProofSchemaPredicate>} [requestedPredicates] A list of requested predicates.
    * Returns {Promise<ProofSchema>} A promise that resolves with the created proof schema.
    */
  def createProofSchema(name: String, version: String): js.Promise[ProofSchema] = js.native
  def createProofSchema(name: String, version: String, requestedAttributes: js.Any): js.Promise[ProofSchema] = js.native
  def createProofSchema(name: String, version: String, requestedAttributes: js.Any, requestedPredicates: js.Any): js.Promise[ProofSchema] = js.native
  /**
    * Creates a {Verification} with another agent.  The initial state must be one of 'outbound_proof_request',
    * 'outbound_verification_request'.
    * {RequestRecipient} to The agent being contacted for verification.
    * {string} proof_schema_id The proof schema the verification is based on.
    * {VerificationState} state The initial state of the verification.
    * {Properties} [properties] Optional metadata to add to the verification.
    * Returns {Promise<Verification>} A promise that resolves with the created verification.
    */
  def createVerification(to: RequestRecipient, proof_schema_id: String, state: VerificationState): js.Promise[Verification] = js.native
  def createVerification(to: RequestRecipient, proof_schema_id: String, state: VerificationState, properties: Properties): js.Promise[Verification] = js.native
  /**
    * Delete a {Connection}.
    * {string} id The ID of an existing connection.
    * Returns {Promise<void>} A promise that resolves when the connection is deleted.
    */
  def deleteConnection(id: String): js.Promise[Unit] = js.native
  /**
    * Delete a {Credential}.
    * {string} id The ID of an existing credential or credential offer.
    * Returns {Promise<void>} A promise that resolves when the credential is deleted.
    */
  def deleteCredential(id: String): js.Promise[Unit] = js.native
  /**
    * Delete device
    * {string} id The ID of a device
    * Returns {object} The delete response from Agency
    */
  def deleteDevice(id: String): js.Any = js.native
  /**
    * Delete listener
    * {string} id The ID of a listener
    * Returns {object} The delete response from Agency
    */
  def deleteListener(id: String): js.Any = js.native
  /**
    * Delete a {Verification}.
    * {string} id The ID of the verification.
    * Returns {Promise<void>} A promise the resolves when the verification is deleted.
    */
  def deleteVerification(id: String): js.Promise[Unit] = js.native
  /**
    * Gets a {Connection}.
    * {string} id The ID for a connection.
    * Returns {Promise<Connection>} A promise that resolves with the given connection, or rejects if something went wrong.
    */
  def getConnection(id: String): js.Promise[Connection] = js.native
  /**
    * Returns a list of {Connection}s.  If query parameters are provided, only connections matching those parameters will
    * be returned.  If none are specified, all of the agent's connections will be returned.
    * {ConnectionQueryParams} [opts] Connections search parameters.
    * Returns {Promise<Connection[]>} A list of all connections or only those matching the query parameters.
    */
  def getConnections(): js.Promise[js.Array[Connection]] = js.native
  def getConnections(opts: ConnectionQueryParams): js.Promise[js.Array[Connection]] = js.native
  /**
    * Get a {Credential}.
    * {string} id The ID of the credential.
    * Returns {Promise<Credential>} A promise that resolves with the credential information.
    */
  def getCredential(id: String): js.Promise[Credential] = js.native
  /**
    * Get a {CredentialDefinition}.
    * {CredentialDefinitionID} id The credential definition ID.
    * Returns {Promise<CredentialDefinition>} A promise that resolves with the credential definition.
    */
  def getCredentialDefinition(id: CredentialDefinitionID): js.Promise[CredentialDefinition] = js.native
  /**
    * Get a list of {CredentialDefinition}s matching the given parameters, or all of them, if no parameters are
    * given.
    * {CredentialDefinitionQueryParams} [opts] Credential definition search parameters.
    * {QueryRoute} [route] A list of parameters used to proxy the request to other agents.
    * Returns {Promise<CredentialDefinition[]>} A promise that resolves with a list of credential definitions.
    */
  def getCredentialDefinitions(): js.Promise[js.Array[CredentialDefinition]] = js.native
  def getCredentialDefinitions(opts: CredentialDefinitionQueryParams): js.Promise[js.Array[CredentialDefinition]] = js.native
  def getCredentialDefinitions(opts: CredentialDefinitionQueryParams, route: QueryRoute): js.Promise[js.Array[CredentialDefinition]] = js.native
  /**
    * Get a {CredentialSchema} record.
    * {CredentialSchemaID} id The ID of the schema
    * Returns {Promise<CredentialSchema>} A promise that resolves with the schema object, or null if not found
    */
  def getCredentialSchema(id: CredentialSchemaID): js.Promise[CredentialSchema] = js.native
  /**
    * Get a list of all {CredentialSchema}s published by your agent, if no parameters are specified, or a list of
    * credential schemas matching the search parameters.  You can use the `route` parameter to direct the request to
    * other agents.
    * {CredentialSchemaQueryParams} [opts] An optional filter for the schemas that are returned.
    * {QueryRoute} [route] A list of parameters used to proxy the request to other agents.
    * Returns {Promise<CredentialSchema[]>} A promise that resolves with a list of credential schemas.
    */
  def getCredentialSchemas(): js.Promise[js.Array[CredentialSchema]] = js.native
  def getCredentialSchemas(opts: Null, route: QueryRoute): js.Promise[js.Array[CredentialSchema]] = js.native
  def getCredentialSchemas(opts: CredentialSchemaQueryParams): js.Promise[js.Array[CredentialSchema]] = js.native
  def getCredentialSchemas(opts: CredentialSchemaQueryParams, route: QueryRoute): js.Promise[js.Array[CredentialSchema]] = js.native
  /**
    * Gets a list of all the {Credential}s on the agent that match the given search parameters, or all of the credentials
    * on the agent, if no parameters are given.
    * {CredentialQueryParams} [opts] Optional search parameters for the credentials
    * Returns {Promise<Credential[]>} A promise that resolves with a list of credentials
    */
  def getCredentials(): js.Promise[js.Array[Credential]] = js.native
  def getCredentials(opts: CredentialQueryParams): js.Promise[js.Array[Credential]] = js.native
  /**
    * Get all devices
    * Returns {object[]} Array of device objects
    */
  def getDevices(): js.Array[_] = js.native
  /**
    * Get this agent's {AgentInfo}.
    * Returns {Promise<AgentInfo>} A promise that resolves with information about the agent.
    */
  def getIdentity(): js.Promise[AgentInfo] = js.native
  /**
    * Get all listeners
    * Returns {object[]} Array of listener objects
    */
  def getListeners(): js.Array[_] = js.native
  /**
    * Get the information for a {Verification}.
    * {string} id The ID of the verification.
    * Returns {Promise<Verification>} A promise that resolves with the verification information.
    */
  def getVerification(id: String): js.Promise[Verification] = js.native
  /**
    * Get a list of all the {Verification}s on the agent, or a subset of verifications that match the search
    * parameters.
    * {VerificationQueryParams} [opts] Search parameters.
    * Returns {Promise<Verification[]>} A promise that resolves with a list of matching verifications.
    */
  def getVerifications(): js.Promise[js.Array[Verification]] = js.native
  def getVerifications(opts: VerificationQueryParams): js.Promise[js.Array[Verification]] = js.native
  /**
    * Create a {@Credential} as an offer to the given holder.
    * {RequestRecipient} to The agent being issued a credential.
    * {CredentialDefinitionID|SchemaIDObj} source The schema or cred def the credential is based on.
    * {object} attributes The `<string>: <string>` pairs for all the fields in the credentials. The
    * list of fields comes from the schema the credential is based on.
    * {Properties} [properties] Optional metadata to add to the credential offer.
    * Returns {Promise<Credential>} A promise that resolves with the credential offer.
    */
  def offerCredential(to: RequestRecipient, source: CredentialDefinitionID, attributes: js.Any): js.Any = js.native
  def offerCredential(to: RequestRecipient, source: CredentialDefinitionID, attributes: js.Any, properties: Properties): js.Any = js.native
  def offerCredential(to: RequestRecipient, source: SchemaIDObj, attributes: js.Any): js.Any = js.native
  def offerCredential(to: RequestRecipient, source: SchemaIDObj, attributes: js.Any, properties: Properties): js.Any = js.native
  /**
    * Set this agent's role to TRUST_ANCHOR on the ledger, giving the agent the ability to publish schemas and
    * credential definitions, which are needed to issue credentials.
    * {string} account_admin_agent_name The admin agent on this agent's account. Only needed if create is true.
    * {string} account_admin_agent_password The admin agent's password.
    * {string} [seed] A valid trustee seed.  Allows this agent to generate the NYM transaction as the network's trustee.
    * Returns {Promise<AgentInfo>} A promise that resolves with the updated agent information.
    */
  def onboardAsTrustAnchor(account_admin_agent_name: String, account_admin_agent_password: String): js.Promise[AgentInfo] = js.native
  def onboardAsTrustAnchor(account_admin_agent_name: String, account_admin_agent_password: String, seed: String): js.Promise[AgentInfo] = js.native
  /**
    * Call Agent REST APIs and make request
    * {string} path The REST API path
    * {object} [options] Set headers, method=GET, POST, PUT, PATCH, DELETE, UPDATE by passing in object {"headers":{...}, "method":...}
    * Returns {object} The response object
    */
  def request(path: String): js.Any = js.native
  def request(path: String, options: js.Any): js.Any = js.native
  /**
    * Creates a {Credential} and sends the credential request to a remote agent.
    * {RequestRecipient} to The issuer of the desired credential.
    * {SchemaIDObj} source Specifies the schema you'd like the credential to be based on.
    * {Properties} [properties] Optional metadata to add to the credential request.
    * Returns {Promise<Credential>} The created credential request.
    */
  def requestCredential(to: RequestRecipient, source: SchemaIDObj): js.Promise[Credential] = js.native
  def requestCredential(to: RequestRecipient, source: SchemaIDObj, properties: Properties): js.Promise[Credential] = js.native
  /**
    * Enable logging for the agent by setting a logging level.
    * {'trace'|'debug'|'info'|'warn'|'error'|'fatal'} log_level The desired logging level.
    * Returns {void}
    */
  def setLoggingLevel(log_level: String): Unit = js.native
  @JSName("setLoggingLevel")
  def setLoggingLevel_debug(log_level: debug): Unit = js.native
  @JSName("setLoggingLevel")
  def setLoggingLevel_error(log_level: error): Unit = js.native
  @JSName("setLoggingLevel")
  def setLoggingLevel_fatal(log_level: fatal): Unit = js.native
  @JSName("setLoggingLevel")
  def setLoggingLevel_info(log_level: info): Unit = js.native
  @JSName("setLoggingLevel")
  def setLoggingLevel_trace(log_level: trace): Unit = js.native
  @JSName("setLoggingLevel")
  def setLoggingLevel_warn(log_level: warn): Unit = js.native
  /**
    * Set url of Agent
    * {string} url The new URL for the Agency.
    * Returns {void}
    */
  def setUrl(url: String): Unit = js.native
  /**
    * Set human readable user name that is displayed in connection, credential or proof UI
    * {string} name The human readable name of the user
    * Returns {void}
    */
  def setUserName(name: String): Unit = js.native
  /**
    * Set user and password for user's Agent
    * {string} user A TI Agent identity.
    * {string} pw The password for the Agency identity.
    * Returns {void}
    */
  def setUserPassword(user: String, pw: String): Unit = js.native
  /**
    * Updates a credential.  You'll really only use this method to accept a credential offer as a holder or fulfill a
    * credential request as an issuer.
    * Accepting a credential offer:
    * agent.updateCredential(cred_id, 'accepted')
    * Fulfilling a credential request:
    * agent.updateCredential(cred_id, 'outbound_offer', {
    *     first_name: 'John',
    *     last_name: 'Doe'
    * }
    * {string} id The credential ID on the agent.
    * {CredentialState} state The updated state of the credential.
    * {object} [attributes] The filled out information for the credential.  Only required when changing the state
    * to 'outbound_offer'.
    * Returns {Promise<Credential>} A promise that resolves with the updated credential data.
    */
  def updateCredential(id: String, state: CredentialState): js.Any = js.native
  def updateCredential(id: String, state: CredentialState, attributes: js.Promise[Credential]): js.Any = js.native
  /**
    * Updates a {Verification}.  A verifier accepts a `inbound_verification_request` by updating the state to
    * `outbound_proof_request`.  The prover generates a proof for a `inbound_proof_request` by updating the state to
    * `proof_generated`.  The prover submits that generated proof request by updating the state to `proof_shared`.
    * Sometimes, you have a selection
    * {string} id The verification ID.
    * {VerificationState} state The updated verification state.
    * {ProofSelection} [choices] The list of credentials you want to use for requested attributes and predicates.
    * {object<string, string>} [self_attested_attributes] The self-attested data to add to the proof.
    * Returns {Promise<Verification>} A Promise that resolves with the updated verification.
    */
  def updateVerification(id: String, state: VerificationState): js.Promise[Verification] = js.native
  def updateVerification(id: String, state: VerificationState, choices: ProofSelection): js.Promise[Verification] = js.native
  def updateVerification(id: String, state: VerificationState, choices: ProofSelection, self_attested_attributes: js.Any): js.Promise[Verification] = js.native
  /**
    * Get a {ProofSchema}
    * {string} id The proof schema ID.
    * Returns {Promise<ProofSchema>} A promise that resolves with the proof schema object.
    */
  def verifierGetProofSchema(id: String): js.Promise[ProofSchema] = js.native
  /**
    * Gets a list of {ProofSchema}s matching the query parameters, if any are given, or all proof schemas on the agent.
    * {ProofSchemaQueryParams} [opts] Query parameters.
    * Returns {Promise<ProofSchema[]>} A promise that resolves with a list of proof schemas
    */
  def verifierGetProofSchemas(): js.Promise[js.Array[ProofSchema]] = js.native
  def verifierGetProofSchemas(opts: ProofSchemaQueryParams): js.Promise[js.Array[ProofSchema]] = js.native
  /**
    * Waits for a {Connection} to enter the 'connected' or 'rejected'.
    * {string} id The connection ID.
    * {number} [retries] The number of times we should check the status of the connection before giving up.
    * {number} [retry_interval] The number of milliseconds to wait between each connection status check.
    * Returns {Promise<Connection>} The accepted {Connection}.
    */
  def waitForConnection(id: String): js.Promise[Connection] = js.native
  def waitForConnection(id: String, retries: Double): js.Promise[Connection] = js.native
  def waitForConnection(id: String, retries: Double, retry_interval: Double): js.Promise[Connection] = js.native
  /**
    * Waits for a given {Credential} to enter the 'issued' or 'rejected' states.
    * {string} id The ID of a credential.
    * {number} [retries] The number of times we should check the status of the credential before giving up.
    * {number} [retry_interval] The amount of time, in milliseconds, to wait between checks.
    * Returns {Promise<Credential>} A promise that resolves with the finished credential.
    */
  def waitForCredential(id: String): js.Promise[Credential] = js.native
  def waitForCredential(id: String, retries: Double): js.Promise[Credential] = js.native
  def waitForCredential(id: String, retries: Double, retry_interval: Double): js.Promise[Credential] = js.native
  /**
    * Waits for a given {Verification} to enter the `passed` or `failed` state.
    * {string} id The verification ID.
    * {number} [retries] The number of times we should check the status of the verification before giving up.
    * {number} [retry_interval] The amount of time, in milliseconds, to wait between checks.
    * Returns {Promise<Verification>} A promise that resolves with the completed verification.
    */
  def waitForVerification(id: String): js.Promise[Verification] = js.native
  def waitForVerification(id: String, retries: Double): js.Promise[Verification] = js.native
  def waitForVerification(id: String, retries: Double, retry_interval: Double): js.Promise[Verification] = js.native
}

