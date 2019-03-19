```
/**
 * Timeout a promise after a specified amount of time.
 *
 * If you pass in a cancelable promise, specifically a promise with a `.cancel()` method, that method will be called when the `pTimeout` promise times out.
 *
 * @param input - Promise to decorate.
 * @param milliseconds - Milliseconds before timing out.
 * @param message - Specify a custom error message or error. If you do a custom error, it's recommended to sub-class `pTimeout.TimeoutError`. Default: `'Promise timed out after 50 milliseconds'`.
 * @returns A decorated `input` that times out after `milliseconds` time.
 */
```